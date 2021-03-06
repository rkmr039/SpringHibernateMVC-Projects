package hcl.employeejson.client;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import hcl.employeejson.model.Employee;
import hcl.employeejson.model.GenericResponse;
import hcl.employeejson.service.EmployeeServiceImpl;

public class EmployeeClient {

	public static void main(String[] args) {

		
	/*	EmployeeServiceImpl employeeServiceImpl = new EmployeeServiceImpl();
		
		Employee[] employees =employeeServiceImpl.getEmployees();
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}*/
		/*ResteasyClient client = new ResteasyClientBuilder().build();
		
		//GET example
		ResteasyWebTarget getDummy = client.target("http://localhost:8085/employee/getAll");
		
		Response getDummyResponse = getDummy.request().get();
		
		String value = getDummyResponse.readEntity(String.class);
        System.out.println(value);
        getDummyResponse.close();  */
        
        //POST example
		/*ResteasyWebTarget add = client.target("http://localhost:8085/RestEasy-Example/employee/add");
		Employee emp = new Employee();
		emp.setEmpNo(50);emp.setEmpName("Rick");emp.setSalary(1000);
		Response addResponse = add.request().post(Entity.entity(emp, MediaType.APPLICATION_XML));
		System.out.println(addResponse.readEntity(GenericResponse.class));
		System.out.println("HTTP Response Code:"+addResponse.getStatus());
		addResponse.close();
		
		addResponse = add.request().post(Entity.entity(emp, MediaType.APPLICATION_XML));
		System.out.println(addResponse.readEntity(GenericResponse.class));
		System.out.println("HTTP Response Code:"+addResponse.getStatus());
		addResponse.close();
		
		//DELETE example
		ResteasyWebTarget delete = client.target("http://localhost:8085/RestEasy-Example/employee/50/delete");
		Response deleteResponse = delete.request().delete();
		System.out.println(deleteResponse.readEntity(GenericResponse.class));
		System.out.println("HTTP Response Code:"+deleteResponse.getStatus());
		deleteResponse.close();
		
		deleteResponse = delete.request().delete();
		System.out.println(deleteResponse.readEntity(GenericResponse.class));
		System.out.println("HTTP Response Code:"+deleteResponse.getStatus());
		deleteResponse.close();*/
	}

}
