package cn.cumt.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.cumt.shop.dao.IOrderDao;
import cn.cumt.shop.dao.impl.OrderDaoImpl;
import cn.cumt.shop.domain.Order;


public class OutSellOrder extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws
		ServletException,IOException{
		req.setCharacterEncoding("utf-8");
		
		String orderid = req.getParameter("orderid") ;
		String goodid = req.getParameter("goodid") ;
		IOrderDao dao = new OrderDaoImpl() ;
		Order o = dao.findorder(Integer.parseInt(goodid), Integer.parseInt(orderid));
		int acount = o.getAcount();
		String time = o.getTime() ;
		String note = o.getNote() ;
		int a = o.getOrder() ;
		int customerid = o.getCustomerid() ;
		
		
		Order order = new Order() ;
		int orderclassid = 4 ;
		int id = dao.getId() ;
		order.setOrder(id);
		order.setOrderid(Integer.parseInt(orderid));
		order.setOrderclassid(orderclassid);
		order.setCustomerid(customerid);
		order.setGoodid(Integer.parseInt(goodid)); //字符串转换为double
		order.setAcount(acount); 
		order.setTime(time); //String字符类型数据转换为Integer整型数据
		order.setNote(note);
		int row = dao.addbuyorder(order);
		
		boolean flag = dao.DelOrder(a) ;
	
		if(flag && row != 0){
			resp.sendRedirect("buytable.jsp");
		}else{
			resp.sendRedirect("null.jsp");
		}
	}

}
