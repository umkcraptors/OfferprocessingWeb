package com.bis.eps.offerprocessing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bis.eps.common.JSONMapper.JSONMapper;
import com.bis.eps.offerprocessing.entity.Marketer;

public class JsonMapperTest {
 Marketer m = new Marketer();
 JSONMapper j = new JSONMapper();
	@Test
	public void javaToJson()
	{
		m.setId(2l);
		m.setDomain("Amazon");
		m.setDescription("Online shopping");
		m.setCurrency("50$");
		m.setIsActive(true);
		m.setMarketertype("Online");
		String result = j.convertJavaToJson(m);
		System.out.println(result);
		String expectedResult = "{\"id\":2,\"domain\":\"Amazon\",\"name\":null,\"marketertype\":\"Online\",\"currency\":\"50$\",\"description\":\"Online shopping\",\"createdBy\":null,\"createdDate\":null,\"updatedBy\":null,\"updatedDate\":null,\"isActive\":true}";
		assertEquals(result,expectedResult);
		String expectedResult1 = "{\"id\":3,\"domain\":\"Amazon\",\"name\":null,\"marketertype\":\"Online\",\"currency\":\"50$\",\"description\":\"Online shopping\",\"createdBy\":null,\"createdDate\":null,\"updatedBy\":null,\"updatedDate\":null,\"isActive\":true}";
		assertEquals(result,expectedResult1);
	}
	
	@Test
	public void jsonToJava() 
	{
		String jsonString = "{\"id\":2,\"domain\":\"Amazon\",\"name\":null,\"marketertype\":\"Online\",\"currency\":\"50$\",\"description\":\"Online shopping\",\"createdBy\":null,\"createdDate\":null,\"updatedBy\":null,\"updatedDate\":null,\"isActive\":true}";
		Marketer m1 = j.convertJsonToJava(jsonString, Marketer.class);
		System.out.println(m1.getDomain());
		assertEquals(m1,m);
		
	}
}
