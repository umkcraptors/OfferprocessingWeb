package com.bis.eps.offerprocessing.service;

import java.util.List;

import com.bis.eps.offerprocessing.entity.Marketer;

public interface MarketerService {
	
	public Marketer addMarketer(Marketer marketer);
	public Marketer updateMarketer(Marketer marketer);
	public Marketer getMarketer(long marketerId);
	public List<Marketer> getAllMarketers();
	public  void deleteMarketer(long marketerId);
}
