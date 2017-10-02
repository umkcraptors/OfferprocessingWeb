package com.bis.eps.offerprocessing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.offerprocessing.dao.ProductDAO;

import com.bis.eps.offerprocessing.entity.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	
	

		@Autowired(required=true)
		@Qualifier("productDao")
		private ProductDAO productDAO;
		
		@Transactional
		public Product addProduct(Product product) {
			
			System.out.println("Product Service create invoked:");
			product = productDAO.save(product);
			return product;
		}
		@Transactional
		public Product updateProduct(Product product) {
			
			System.out.println("Product Service Update invoked:");
			product = productDAO.save(product);
			return product;
		}

		public Product getProduct(long productId) {
			return productDAO.find(productId);
		}

		public List<Product> getAllProducts() {
			return productDAO.findAll();
		}
		@Transactional
		public void deleteProduct(long productId) {
			productDAO.delete(productId);
		}


	}

	