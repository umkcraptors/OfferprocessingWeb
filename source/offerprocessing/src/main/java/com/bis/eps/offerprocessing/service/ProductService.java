package com.bis.eps.offerprocessing.service;

import java.util.List;

import com.bis.eps.offerprocessing.entity.Product;


public interface ProductService {
	public Product addProduct(Product product);
	public Product updateProduct(Product product);
	public Product getProduct(long productId);
	public List<Product> getAllProducts();
	public  void deleteProduct(long productId);
}
