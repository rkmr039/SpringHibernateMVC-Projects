package hcl.JsonDemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonArrayExample {
	public static void main(String[] args) {
		JSONObject emp = new JSONObject();
		for(int i=0; i<3; i++) {
			JSONArray array = new JSONArray();
			array.add("Emp : "+i);
			array.add(1000*i);
			array.add(25+i);
			emp.put(i, array);
		}
		System.out.println(emp);
	}
}
