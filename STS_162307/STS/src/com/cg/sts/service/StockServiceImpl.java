package com.cg.sts.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sts.bean.StockBean;
import com.cg.sts.dao.StockDAO;

@Service("service")
@Transactional
public class StockServiceImpl implements StockService
{
	@Autowired
	StockDAO dao;
	
	@Override
	public List<StockBean> showAllStocks() 
	{
		
		return dao.showAllStocks();
	}

	@Override
	public StockBean getQuote(String stockName) {
		
		return dao.getQuote(stockName);
	}

}
