package com.bis.eps.common.JSONMapper;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
public class JSONMapper<T> {
private static ObjectMapper mapper;
static {
	mapper=new ObjectMapper();
	
}
public static String convertJavaToJson(Object object) {
	String jsonResult="";
	try {
		jsonResult=mapper.writeValueAsString(object);
		
	} catch (JsonGenerationException e) {
		System.out.println("Exception occured while converting Java Object to Json."+ e.getMessage());

	} catch (JsonMappingException e) {
		System.out.println("Exception occured while converting Java Object to Json."+ e.getMessage());
	} catch (IOException e) {
		System.out.println("Exception occured while converting Java Object to Json."+ e.getMessage());
	}
	return jsonResult;
}

public static <T> T convertJsonToJava(String jsonValue, Class<T>cls) {
	T result = null;
	
		try {
			result=mapper.readValue(jsonValue, cls);
		} catch (IOException e) {
			
			System.out.println("Exception occured while converting JSON to java object."+ e.getMessage());
		}
	
	return result;
}
}