package com.bis.eps.offerprocessing;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bis.eps.offerprocessing.service.ProductService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ProductServiceTest {

	@Autowired
	ProductService service;
	
	@Test
	public void findAllProductTest()
	{
		System.out.println(service.getAllProducts());
	}
}
