package com.hcl.nashromdemo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JSNashronDemo {
	public static void main(String[] args) {
			
		ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
		ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");
		
		String name="Mahesh";
		Integer result = null;
		
		try{
			nashorn.eval("print('name : "+ name+"')"); 
			result = (Integer)nashorn.eval("10 + 3");
		}catch(ScriptException e) {
			System.out.println("Error Executing Script : "+ e.getMessage());
		}
		System.out.println(result.toString());
	}
}
