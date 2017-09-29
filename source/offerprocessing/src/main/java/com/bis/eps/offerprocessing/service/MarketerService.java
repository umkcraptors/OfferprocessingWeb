package com.bis.eps.offerprocessing.service;

import java.util.List;

import com.bis.eps.offerprocessing.entity.Marketer;
import com.bis.eps.offerprocessing.exception.DeleteFailedException;
import com.bis.eps.offerprocessing.exception.InsertFailedException;
import com.bis.eps.offerprocessing.exception.RetrieveFailedException;
import com.bis.eps.offerprocessing.exception.UpdateFailedException;


public interface MarketerService {
	
	public Marketer addMarketer(Marketer marketer) throws InsertFailedException;
	public Marketer updateMarketer(Marketer marketer) throws UpdateFailedException;
	public Marketer getMarketer(long marketerId) throws RetrieveFailedException;
	public List<Marketer> getAllMarketers();
	public  void deleteMarketer(long marketerId) throws DeleteFailedException;
}
