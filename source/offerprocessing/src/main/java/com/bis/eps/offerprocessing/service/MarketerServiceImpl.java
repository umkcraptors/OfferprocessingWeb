package com.bis.eps.offerprocessing.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.offerprocessing.dao.MarketerDao;
import com.bis.eps.offerprocessing.entity.Marketer;

@Service("marketerService")
@Transactional
public class MarketerServiceImpl implements MarketerService {

	@Autowired(required=true)
	@Qualifier("marketerDao")
	private MarketerDao marketerDAO;
	
	@Transactional
	public Marketer addMarketer(Marketer marketer) {
		
		System.out.println("Marketer Service create invoked:");
		marketer = marketerDAO.save(marketer);
		return marketer;
	}
	@Transactional
	public Marketer updateMarketer(Marketer marketer) {
		
		System.out.println("Marketer Service Update invoked:");
		marketer = marketerDAO.save(marketer);
		return marketer;
	}

	public Marketer getMarketer(long marketerId) {
		return marketerDAO.find(marketerId);
	}

	public List<Marketer> getAllMarketers() {
		return marketerDAO.findAll();
	}
	@Transactional
	public void deleteMarketer(long marketerId) {
		marketerDAO.delete(marketerId);
	}


}
