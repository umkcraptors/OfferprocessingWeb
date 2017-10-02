package com.bis.eps.offerprocessing.service;

import java.util.List;

import com.bis.eps.offerprocessing.entity.Marketer;
import com.bis.eps.offerprocessing.entity.MarketerProduct;

public interface MarketerProductService {
	
	public MarketerProduct addMarketerProduct(MarketerProduct marketerproduct);
	public MarketerProduct updateMarketerProduct(MarketerProduct marketerproduct);
	public MarketerProduct getMarketerProduct(long marketerproductId);
	public List<MarketerProduct> getAllMarketerProducts();
	public  void deleteMarketerProduct(long marketerproductId);

}
