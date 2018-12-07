package com.cg.sts.dao;

import java.util.List;

import com.cg.sts.bean.StockBean;

public interface StockDAO {

	List<StockBean> showAllStocks();

	StockBean getQuote(String stockName);

}
