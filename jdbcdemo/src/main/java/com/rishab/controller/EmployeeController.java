package com.rishab.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rishab.model.Employee;
import com.rishab.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/getAll")
	public ResponseEntity<String> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		JSONObject jsonObject = new JSONObject();
		JSONArray array = new JSONArray();
		for (Employee employee : employees) {

			JSONObject obj = new JSONObject();
			JSONObject obj2 = new JSONObject();
			obj.put("empNo ", employee.getEmpNo());
			obj.put("empName", employee.getEmpName());
			obj.put("band", String.valueOf(employee.getBand()));
			obj.put("dateOfJoin", String.valueOf(employee.getDateOfJoin()));
			obj.put("salary", String.valueOf(employee.getSalary()));
			obj2.put("employee", obj);
			array.add(obj2);

		}
		jsonObject.put("employees", array);
		String empsJson = jsonObject.toJSONString();
		return new ResponseEntity<String>(empsJson, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/saveOrUpdate")
	public ResponseEntity<String> saveOrUpdate(@RequestBody String jsonText) {
		// System.out.println(json);
		Object object = JSONValue.parse(jsonText);

		JSONObject jsonObject = (JSONObject) object;
		// System.out.println(jsonObject);
		Employee employee = new Employee();
		String empname = (String) jsonObject.get("empName");
		double salary = (Double) jsonObject.get("salary");
		char band = ((String) jsonObject.get("band")).charAt(0);
		Date doj = Date.valueOf((String) jsonObject.get("dateOfJoin"));

		employee.setEmpName(empname);
		employee.setSalary(salary);
		employee.setBand(band);
		employee.setDateOfJoin(doj);
		
		if(Integer.parseInt((String) jsonObject.get("empNo")) != 0 ) {
			employee.setEmpNo(Integer.parseInt((String) jsonObject.get("empNo")));
		}

		String json = employeeService.saveOrUpdate(employee);
		return new ResponseEntity<String>(json, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping("/saveAll")
	public ResponseEntity<String> saveAllEmployes(@RequestBody String jsonText) {
		List<Employee> employees = new ArrayList<Employee>();
		Object object = JSONValue.parse(jsonText);
		JSONObject jsonObject = (JSONObject) object;
	
		JSONArray array = (JSONArray) jsonObject.get("employees");
		// System.out.println(array);
		for (Object object2 : array) {
			JSONObject temp = (JSONObject) object2;
			temp = (JSONObject) temp.get("employee");
			// System.out.println(temp);
			
			Employee employee = new Employee();
			
			String empname = (String) temp.get("empName");
			double salary = (Double) temp.get("salary");
			char band = ((String) temp.get("band")).charAt(0);
			Date doj = Date.valueOf((String)temp.get("dateOfJoin"));
			
			if(Integer.parseInt((String) jsonObject.get("empNo")) != 0 ) {
				employee.setEmpNo(Integer.parseInt((String) jsonObject.get("empNo")));
			}
			
			employee.setEmpName(empname); 
			employee.setSalary(salary);
	        employee.setBand(band); 
	        employee.setDateOfJoin(doj); 
	        employees.add(employee);
	        System.out.println(employee.toString());
			
		}
		jsonText = employeeService.saveAll(employees);
		return new ResponseEntity<String>(jsonText, new HttpHeaders(), HttpStatus.OK);
	}
	
	@GetMapping("/findById")
	public ResponseEntity<Employee> getByEmployeeId(@RequestParam String id) {
		System.out.println("FindById:" + id);
		int id_ = Integer.parseInt(id);
		Employee employee = employeeService.getEmployeeById(id_);
		return new ResponseEntity<Employee>(employee,new HttpHeaders(),HttpStatus.OK); 
	}
	
	@DeleteMapping("deleteById")
	public ResponseEntity<String> deleteEmployeById(@RequestParam String id) {
		System.out.println("DeleteById : "+ id);
		int id_ = Integer.parseInt(id);
		String result = employeeService.deleteById(id_);
		return new ResponseEntity<String>(result,new HttpHeaders(),HttpStatus.OK); 
	}
	
}
