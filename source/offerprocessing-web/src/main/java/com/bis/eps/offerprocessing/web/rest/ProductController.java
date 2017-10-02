package com.bis.eps.offerprocessing.web.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.eps.offerprocessing.entity.Product;
import com.bis.eps.offerprocessing.service.ProductService;
import com.bis.eps.offerprocessing.web.dto.StatusDTO;



@RestController
@RequestMapping("/product")
public class ProductController {
	
	Logger  LOG = Logger.getLogger(ProductController.class.getName());
	
	@Autowired(required=true)
	@Qualifier("productService")
	private ProductService productService;
	
	@GetMapping("/{productId}")
	public Product getProducts(@PathVariable("productId") long productId){
		LOG.info("getProducts for " + productId);
		return productService.getProduct(productId);
	}
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Product> allProducts(){
		List<Product> list = productService.getAllProducts();
		return list;
	}
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Product editProduct(@RequestBody Product product){
		 product = productService.updateProduct(product);
		return product;
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product product){
	    product = productService.addProduct(product);
		return product;
	}
	
	@RequestMapping(value="/delete/{productId}",method=RequestMethod.GET)
	public StatusDTO delete(@PathVariable("productId") long productId){
	   
		productService.deleteProduct(productId);
		StatusDTO status = new StatusDTO();
		status.setMessage("Product Deleted Successfully");
		status.setStatus(200);
		return status;
	}
	
}
