package com.bis.eps.offerprocessing.dao;

import java.util.List;

import com.bis.eps.common.dao.JpaDao;

import com.bis.eps.offerprocessing.entity.MarketerProduct;

public class MarketerProductDAOImpl extends JpaDao<MarketerProduct, Long> implements MarketerProductDAO {
	
	public MarketerProductDAOImpl()
	{
		super(MarketerProduct.class);
	}

	
}
