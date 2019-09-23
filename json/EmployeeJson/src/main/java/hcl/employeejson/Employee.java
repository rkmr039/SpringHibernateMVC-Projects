package hcl.employeejson;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	

	@Id
	private int empNo;
	       private String empName;
	       private double salary;
	       private char band;
	       private Date dateOfJoin;
	       
	       
		public int getEmpNo() {
			return empNo;
		}
		public void setEmpNo(int empNo) {
			this.empNo = empNo;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public char getBand() {
			return band;
		}
		public void setBand(char band) {
			this.band = band;
		}
		public Date getDateOfJoin() {
			return dateOfJoin;
		}
		public void setDateOfJoin(Date dateOfJoin) {
			this.dateOfJoin = dateOfJoin;
		}
	       
	       
}