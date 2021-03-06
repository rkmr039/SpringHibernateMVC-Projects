package hcl.employeejson;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import hcl.employeejson.dao.EmployeeDao;
import hcl.employeejson.dao.EmployeeDaoImpl;
import hcl.employeejson.model.Employee;

@Path("/tabletojson")
public class EmployeeToJson {
	
	@GET
	@Path("/getAllEmployees")
	public Employee[] getAllEmployeesInJson() {
		List<Employee> employees = new ArrayList<Employee>();
		employees = new EmployeeDaoImpl().getEmployees();
		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();
		for (Employee employee : employees) {
			
			JSONObject obj = new JSONObject();	
			obj.put("empNo ",employee.getEmpNo());
			obj.put("empName",employee.getEmpName());
			obj.put("band",String.valueOf(employee.getBand()));
			obj.put("dateOfJoin",String.valueOf(employee.getDateOfJoin()));
			obj.put("salary", String.valueOf(employee.getSalary()));
			array.add(obj);
			
		}
		JSONObject j = new JSONObject();
		j.put("employee",array);
		jsonObject.put("employees",j);
	
		Employee[] empArray = new Employee[employees.size()];
		int i= 0;
		for (Employee employee : employees) {
			empArray[i] = employee;
			i++;
			
		}
		return empArray;
	}
	// working peoperly
	/* public static void main(String[] args) {
		EmployeeToJson employeeToJson = new EmployeeToJson();
		employeeToJson.getAllEmployeesInJson();
	}*/
}
