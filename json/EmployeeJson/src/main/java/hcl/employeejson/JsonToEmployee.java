package hcl.employeejson;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonToEmployee {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader bf = null;
		try {
			fr = new FileReader("C:\\fullstackjava\\employee.json");
			bf = new BufferedReader(fr);
			String line = "";
			String jsonText = "";
			
			while((line = bf.readLine()) != null) {
				jsonText += line;
			}
			
			Object obj = JSONValue.parse(jsonText);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject empsObject = (JSONObject) jsonObject.get("employees");
			JSONArray empsArr = (JSONArray) empsObject.get("employee");
			
			for (Object object : empsArr) {
				
				JSONObject emp = (JSONObject)object;
				System.out.println(emp.toString());
				
				String doj = (String)emp.get("dateOfJoin");
				String empName = (String) emp.get("empName");
			    String empNo = (String)emp.get("empNo");
			    String band = (String)emp.get("band");
			    String salary  = (String) emp.get("salary");
			  
			    Employee employee = new Employee();
			    employee.setEmpNo(Integer.parseInt(empNo));
			    employee.setEmpName(empName);
			    employee.setSalary(Double.parseDouble(salary));
			    employee.setBand(band.charAt(0));
			    employee.setDateOfJoin(Date.valueOf(doj));
				
			    new EmployeeDao().addEmployee(employee);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
