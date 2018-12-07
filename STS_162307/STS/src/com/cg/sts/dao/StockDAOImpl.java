package com.cg.sts.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.sts.bean.StockBean;

@Repository("dao")
public class StockDAOImpl implements StockDAO 
{
	@PersistenceContext
	EntityManager entityManager;
	

	@Override
	public List<StockBean> showAllStocks() 
	{
		Query queryone = entityManager.createQuery("FROM StockBean");
		List<StockBean> stockList = queryone.getResultList();
		return stockList;
	}


	@Override
	public StockBean getQuote(String stockName) {
		Query querytwo = entityManager.createQuery("SELECT  e FROM stock_master e WHERE stock=:stockName");
		 querytwo.setParameter("Quote", stockName);
         StockBean sb = (StockBean) querytwo.getSingleResult();
         return sb;
		
	}

}
