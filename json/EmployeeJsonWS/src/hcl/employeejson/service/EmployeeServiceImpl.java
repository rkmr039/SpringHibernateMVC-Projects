package hcl.employeejson.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import hcl.employeejson.dao.EmployeeDaoImpl;
import hcl.employeejson.model.Employee;

@Path("/employee")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();

	
	public EmployeeServiceImpl() {
		System.out.println("EmployeeServiceImpl()");
	}
	
	@Override
	@GET
	@Path("/getAll")
	public String getEmployees() {
		List<Employee> employees = employeeDaoImpl.getEmployees();
		String result = "";
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
		result = jsonObject.toJSONString();
	return result;
		//return Response.status(200).entity(result).build();
	}


}
