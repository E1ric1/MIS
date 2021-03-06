package cn.cumt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.cumt.shop.dao.IGoodDao;
import cn.cumt.shop.dao.IOrderDao;
import cn.cumt.shop.dao.impl.GoodDaoImpl;
import cn.cumt.shop.dao.impl.OrderDaoImpl;
import cn.cumt.shop.domain.Good;
import cn.cumt.shop.domain.Order;

public class AddBuyOrder extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		
		//商品的各个属�?
		String orderid = request.getParameter("orderid");
		String supplierid = request.getParameter("supplierid");
		String goodid = request.getParameter("goodid");
		String acount = request.getParameter("acount");
		String time = request.getParameter("time");
		String note = request.getParameter("note");
		//保存id	
		IOrderDao dao = new OrderDaoImpl();
		Order order = new Order() ;
		int orderclassid=1 ;
		int id = dao.getId() ;
		order.setOrder(id);
		order.setOrderid(Integer.parseInt(orderid));
		order.setOrderclassid(orderclassid);
		order.setSupplierid(Integer.parseInt(supplierid));
		order.setGoodid(Integer.parseInt(goodid)); //字符串转换为double
		order.setAcount(Integer.parseInt(acount)); 
		order.setTime(time); //String字符类型数据转换为Integer整型数据
		order.setNote(note);
		int row = dao.addbuyorder(order);
		
		//库存更改
		IGoodDao d = new GoodDaoImpl();
		Good good = new Good() ;
		good = d.findById(Integer.parseInt(goodid));
		int goodamount = good.getGoodamount() ;
		int add = goodamount + Integer.parseInt(acount) ;
		int raw = d.udateBuyGood(add, Integer.parseInt(goodid));
		
		if(row !=0 && raw !=0){
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("delgood.jsp");
		}else{
			response.sendRedirect("null.jsp");
		}
	}

}
