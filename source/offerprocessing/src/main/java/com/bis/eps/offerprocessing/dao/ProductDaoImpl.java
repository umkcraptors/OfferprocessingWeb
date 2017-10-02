package com.bis.eps.offerprocessing.dao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.common.dao.JpaDao;
import com.bis.eps.offerprocessing.entity.Product;

@Repository("ProductDao")
@Transactional 
public class ProductDaoImpl extends JpaDao<Product, Long> implements ProductDAO{

	public ProductDaoImpl()
	{
		super(Product.class);
	}
}

