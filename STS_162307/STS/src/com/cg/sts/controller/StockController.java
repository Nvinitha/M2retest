package com.cg.sts.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.sts.bean.StockBean;
import com.cg.sts.service.StockService;

@Controller
public class StockController 
{
	@Autowired
	StockService service;
	
	// To Display Welcome Page
	@RequestMapping(value="StockDetails",method=RequestMethod.GET)// the GET for displaying data in the form,
	public ModelAndView showAllHotels()
	{
		List<StockBean> stockList= service.showAllStocks();
		return new ModelAndView("index","list", stockList);
	}
	
	// to display Order Page
	@RequestMapping(value="stockbook",method=RequestMethod.GET)// the GET for displaying data in the form,
	public ModelAndView bookingConfirmation(@RequestParam("name")String stockName,@ModelAttribute("my")StockBean sb)
	{
		
		return new ModelAndView("ShareBooking","stockname", sb);
	}
	
	
	/*X@RequestMapping(value="stockbook",method=RequestMethod.GET)// the GET for displaying data in the form,
	public ModelAndView bookingConfirmation(@RequestParam("name")String stockName)
	{
		
		return new ModelAndView("Share","stockname", stockName);
	}*/
	
	@RequestMapping(value="ordershare",method=RequestMethod.POST) //the POST for the create operation, via form’s submit.
	public ModelAndView shareOrder(@Valid@ModelAttribute("my") StockBean bean,BindingResult result)
	{
		int id=0;
	
		if(result.hasErrors()){
			
			return new ModelAndView("ShareBooking");
		}
		/*else
		{
		 id=service.addEmployeeData(emp);
		}*/
		return new ModelAndView("summary","details",id);
		
	}

}
