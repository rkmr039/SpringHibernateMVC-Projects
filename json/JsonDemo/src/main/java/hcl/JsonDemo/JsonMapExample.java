package hcl.JsonDemo;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonMapExample {
	public static void main(String[] args) {
		JSONObject object = new JSONObject();
		Map<String,String> map = new HashMap<String, String>();
		
		map.put("name", "R");
		map.put("age", "22");
		map.put("salary", "30000");
		
		String jsonText = JSONValue.toJSONString(map);
		System.out.println(jsonText);
		
	}
}
