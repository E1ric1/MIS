package cn.cumt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cumt.shop.dao.IGoodDao;
import cn.cumt.shop.dao.IOrderDao;
import cn.cumt.shop.dao.impl.GoodDaoImpl;
import cn.cumt.shop.dao.impl.OrderDaoImpl;
import cn.cumt.shop.domain.Good;
import cn.cumt.shop.domain.Order;

public class DelSellOrder extends HttpServlet{
	private static final long serialVersionUID = 1L ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String orderid = req.getParameter("orderid") ;
		String goodid = req.getParameter("goodid") ;
		req.setAttribute("orderid",orderid);
		IOrderDao dao = new OrderDaoImpl() ;
		Order order = dao.findorder(Integer.parseInt(goodid), Integer.parseInt(orderid));
		int acount = order.getAcount();
		int a = order.getOrder();
		//库存更改
		IGoodDao d = new GoodDaoImpl();
		Good good = new Good() ;
		good = d.findById(Integer.parseInt(goodid));
		int goodamount = good.getGoodamount() ;
		int del = goodamount - acount ;
		int raw = d.udateBuyGood(del, Integer.parseInt(goodid));
		boolean flag = dao.DelOrder(a) ;
	
		if(flag && raw !=0){
			resp.sendRedirect("selltable.jsp");
		}else{
			resp.sendRedirect("null.jsp");
		}

	}
	
}