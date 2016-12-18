package cn.cumt.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Buy extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		
		//商品的各个属�?
		int order = Integer.parseInt(request.getParameter("order"));
		request.setAttribute("order",order);
		request.getRequestDispatcher("buydetail1.jsp").forward(request, response);
	}

}
