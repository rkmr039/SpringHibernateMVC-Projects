package com.hcl.parserbase;

/*
 * Parse XML in Java Demo
 * https://howtodoinjava.com/xml/read-xml-dom-parser-example/
 * https://www.journaldev.com/1240/java-xml-parser
 * https://struts.apache.org/getting-started/form-validation-using-xml.html
 */
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MainApp {
	public static void main(String[] args) {
		Document document = null;
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder documentBuilder =  factory.newDocumentBuilder();
			document = documentBuilder.parse(new File("C:\\fullstackjava\\XML\\XmlParserDemo\\src\\com\\hcl\\parserbase\\employee.xml"));
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		document.getDocumentElement().normalize();
		Element root = document.getDocumentElement();
		
		String rootNode = root.getNodeName();
		System.out.println(rootNode);
		
		NodeList nodeList = document.getElementsByTagName("employee");
		
		for (int index = 0; index < nodeList.getLength(); index++) {
			Node node = nodeList.item(index);
			System.out.println("==================================");
			// if node is an element type node
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element)node;
				System.out.println("Employee No           : " + element.getElementsByTagName("empno").item(0).getTextContent());
				System.out.println("Employee Name         : " + element.getElementsByTagName("empname").item(0).getTextContent());
				System.out.println("Employee Salary       : " + element.getElementsByTagName("salary").item(0).getTextContent());
				System.out.println("Employee Band         : " + element.getElementsByTagName("band").item(0).getTextContent());
				System.out.println("Employee Date of Join : " + element.getElementsByTagName("dateofjoin").item(0).getTextContent());
			}
			
		}
		
	}
}