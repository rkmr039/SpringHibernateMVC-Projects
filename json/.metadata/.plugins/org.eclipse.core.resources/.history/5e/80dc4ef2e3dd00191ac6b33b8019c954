package hcl.employeejson;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class EmployeeToJson {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees = new EmployeeDao().getEmployees();
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
		System.out.println(jsonObject);
		
	}
}
