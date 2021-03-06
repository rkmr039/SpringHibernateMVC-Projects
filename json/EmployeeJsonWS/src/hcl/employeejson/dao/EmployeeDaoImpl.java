package hcl.employeejson.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hcl.employeejson.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		SessionFactory sf =  HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Query q = s.createQuery("from Employee");
		employees = q.list();
		return employees;
	}
	@Override
	public void addEmployee(Employee employee) {
		SessionFactory sf =  HibernateUtil.getSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.getTransaction();
		s.save(employee);
		t.begin();
		t.commit();
	}

}
