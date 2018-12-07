package com.cg.sts.service;

import java.util.List;

import com.cg.sts.bean.StockBean;

public interface StockService
{

	List<StockBean> showAllStocks();

	StockBean getQuote(String stockName);

}
