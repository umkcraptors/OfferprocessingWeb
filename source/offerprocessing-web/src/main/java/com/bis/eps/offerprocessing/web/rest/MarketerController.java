package com.bis.eps.offerprocessing.web.rest;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bis.eps.offerprocessing.entity.Marketer;
import com.bis.eps.offerprocessing.exception.InsertFailedException;
import com.bis.eps.offerprocessing.exception.RetrieveFailedException;
import com.bis.eps.offerprocessing.service.MarketerService;
import com.bis.eps.offerprocessing.web.dto.StatusDTO;




@RestController
@RequestMapping("/marketer")
public class MarketerController {
	
	Logger  LOG = Logger.getLogger(MarketerController.class.getName());
	
	@Autowired(required=true)
	@Qualifier("marketerService")
	private MarketerService marketerService;
	
	@GetMapping("/{marketerId}")
	public Marketer getMarketers(@PathVariable("marketerId") long marketerId){
		LOG.info("getMarketers for " + marketerId);
		try {
			return marketerService.getMarketer(marketerId);
		} catch (RetrieveFailedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOG.error("Error in controller retrive method");
		}
		return null;
	}
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public List<Marketer> allMarketers(){
		List<Marketer> list = marketerService.getAllMarketers();
		return list;
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Marketer editMarketer(@RequestBody Marketer marketer){
		LOG.info("Update method in controller");
		try {
		marketer = marketerService.updateMarketer(marketer);
		}
		 catch(Exception e) {
			   LOG.error(e+"Error");
		 }
		return marketer;
		
	}
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Marketer addMarketer(@RequestBody Marketer marketer){
		LOG.info("Add method in controller marketer");		
			try {
				marketer = marketerService.addMarketer(marketer);
			} catch (InsertFailedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
	    return marketer;
	}
	
	@RequestMapping(value="/delete/{marketerId}",method=RequestMethod.GET)
	public StatusDTO delete(@PathVariable("marketerId") long marketerId){
	   try {
		marketerService.deleteMarketer(marketerId);
		LOG.info("delete Marketers for " + marketerId);
		}
	   catch(Exception e) {
		   LOG.error(e+"Error");
		StatusDTO status = new StatusDTO();
		status.setMessage("Marketer Deleted Successfully");
		status.setStatus(200);
		return status;
	   }
	return null;
	}
	
}
