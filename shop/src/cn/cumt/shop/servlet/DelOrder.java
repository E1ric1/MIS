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

public class DelOrder extends HttpServlet{
	private static final long serialVersionUID = 1L ;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int orderid = Integer.parseInt(req.getParameter("orderid").trim()) ;
		int goodid= Integer.parseInt(req.getParameter("goodid").trim()) ;
		IOrderDao dao = new OrderDaoImpl() ;
		Order order = dao.findorder(orderid);
		int acount = order.getAcount();
		//库存更改
		IGoodDao d = new GoodDaoImpl();
		Good good = new Good() ;
		good = d.findById(goodid);
		int goodamount = good.getGoodamount() ;
		int del = goodamount - acount ;
		int raw = d.udateBuyGood(del,goodid);
		boolean flag = dao.DelOrder(orderid) ;
	
		if(flag && raw !=0){
			resp.sendRedirect("delgood.jsp");
		}else{
			resp.sendRedirect("null.jsp");
		}

	}
	
}