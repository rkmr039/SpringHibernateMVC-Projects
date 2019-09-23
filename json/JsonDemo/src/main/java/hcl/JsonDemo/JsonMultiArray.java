package hcl.JsonDemo;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonMultiArray {
	public static void main(String[] args) {
		JSONArray array = new JSONArray();
		JSONObject object = new JSONObject();
		for(int i=0;i<3;i++) {
			JSONArray empDetails = new JSONArray();
			empDetails.add(1000*i);
			empDetails.add(i+1000);
			array.add(i);
			array.add(empDetails);
			object.put(i, array);
			System.out.println(array);
		}
		
		System.out.println(object);
	}
}