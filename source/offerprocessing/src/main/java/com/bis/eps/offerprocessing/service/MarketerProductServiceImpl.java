package com.bis.eps.offerprocessing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.offerprocessing.dao.MarketerProductDAO;
import com.bis.eps.offerprocessing.entity.MarketerProduct;



@Service("marketerProductService")
@Transactional
public class MarketerProductServiceImpl implements MarketerProductService{
	
	@Autowired(required=true)
	@Qualifier("marketerProductDAO")
	private MarketerProductDAO marketerProductDAO;

	@Transactional
	public MarketerProduct addMarketerProduct(MarketerProduct marketerproduct) {
		System.out.println("MarketerProduct Service create invoked:");
		marketerproduct = marketerProductDAO.save(marketerproduct);
		return marketerproduct;
	}

	@Transactional
	public MarketerProduct updateMarketerProduct(MarketerProduct marketerproduct) {
		System.out.println("MarketerProduct Service Update invoked:");
		marketerproduct = marketerProductDAO.save(marketerproduct);
		return marketerproduct;
	}

	@Transactional
	public MarketerProduct getMarketerProduct(long marketerproductId) {
		return marketerProductDAO.find(marketerproductId);
	}

	@Transactional
	public List<MarketerProduct> getAllMarketerProducts() {
		return marketerProductDAO.findAll();
	}

	@Transactional
	public void deleteMarketerProduct(long marketerproductId) {
		marketerProductDAO.delete(marketerproductId);
		
	}
	

}
