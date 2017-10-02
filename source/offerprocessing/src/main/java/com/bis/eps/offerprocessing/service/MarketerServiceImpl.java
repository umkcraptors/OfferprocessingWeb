package com.bis.eps.offerprocessing.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bis.eps.offerprocessing.dao.MarketerDao;
import com.bis.eps.offerprocessing.entity.Marketer;
import com.bis.eps.offerprocessing.exception.DeleteFailedException;
import com.bis.eps.offerprocessing.exception.InsertFailedException;
import com.bis.eps.offerprocessing.exception.RetrieveFailedException;
import com.bis.eps.offerprocessing.exception.UpdateFailedException;


@Service("marketerService")
@Transactional
public class MarketerServiceImpl implements MarketerService {
	Logger  LOG = Logger.getLogger(MarketerServiceImpl.class.getName());

	@Autowired(required=true)
	@Qualifier("marketerDao")
	private MarketerDao marketerDAO;
	
	@Transactional
	public Marketer addMarketer(Marketer marketer) throws InsertFailedException {
		try
		{
		System.out.println("Marketer Service create invoked:");
		marketer = marketerDAO.save(marketer);
		throw new InsertFailedException("Insertion failed");
		}
		catch(Exception ex) {
			ex.printStackTrace();
       	 LOG.error("Adding marketer details exception..." ,ex);	
       	 
		}
		return marketer;
	}
	@Transactional
	public Marketer updateMarketer(Marketer marketer) throws UpdateFailedException {
		try {
		System.out.println("Marketer Service Update invoked:");
		marketer = marketerDAO.save(marketer);
		throw new UpdateFailedException("Updation failed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			LOG.info("Updating marketer details exception..." ,e);			
		}
		return marketer;
	}

	public Marketer getMarketer(long marketerId)  {
	try {
		return marketerDAO.find(marketerId);
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		LOG.info("Received marketer details exception..." ,e);			
	}
	return null;
	}
	


	public List<Marketer> getAllMarketers() {
		return marketerDAO.findAll();
	}
	@Transactional
	public void deleteMarketer(long marketerId) throws DeleteFailedException {
		try{
			 marketerDAO.delete(marketerId);
			throw new DeleteFailedException("Delete Exception");
		}
         catch (Exception ex) {
			
        	 LOG.info("Received marketer details exception..." ,ex);	
		}
	}


}
