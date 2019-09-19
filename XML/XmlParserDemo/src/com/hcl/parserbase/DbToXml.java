package com.hcl.parserbase;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class DbToXml {

		public static void main(String[] args) {
			Employees empList = new DaoConnection().getEmployees();
			jaxbObjectToXml(empList);			
		}

		private static void jaxbObjectToXml(Employees employees) {
			JAXBContext jaxbContext = null;
			StringWriter sw = null;
			try{
			
     			jaxbContext = JAXBContext.newInstance(Employees.class);

				Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
				
				jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				
				sw = new StringWriter();
					
				jaxbMarshaller.marshal(employees, sw);
				jaxbMarshaller.marshal(employees, new FileOutputStream("C:\\fullstackjava\\XML\\XmlParserDemo\\src\\com\\hcl\\parserbase\\employee.xml"));
				
			
			} catch(JAXBException e) {
				System.out.println(e.getMessage());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(sw.toString());

		}
	
}