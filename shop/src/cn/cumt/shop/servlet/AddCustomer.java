package cn.cumt.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.cumt.shop.dao.ICustomerDao;
import cn.cumt.shop.dao.impl.CustomerDaoImpl;
import cn.cumt.shop.domain.Customer;


public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		//商品的各个属�?
		
		String customerid = request.getParameter("customerid");
		String customername = request.getParameter("customername");
		String customertel = request.getParameter("customertel");
		String customeraddress = request.getParameter("customeraddress");
		String customernote = request.getParameter("customernote");
		
	
		ICustomerDao dao = new CustomerDaoImpl();
		Customer customer = new Customer() ;
		int id = dao.getId() ;
		customer.setCustomer(id);
		customer.setCustomerid(Integer.parseInt(customerid));
		customer.setCustomername(customername);
		customer.setCustomertel(customertel);
		customer.setCustomeraddress(customeraddress);
		customer.setCustomernote(customernote);
		int row = dao.addCustomer(customer);
		String msg ;
		if(row !=0){
			msg="成功" ;
		}else{
			msg="失败" ;
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("managecustomer.jsp").forward(request, response);
	}

}
