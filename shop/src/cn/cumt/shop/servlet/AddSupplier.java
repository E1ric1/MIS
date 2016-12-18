package cn.cumt.shop.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import cn.cumt.shop.dao.ISupplierDao;
import cn.cumt.shop.dao.impl.SupplierDaoImpl;
import cn.cumt.shop.domain.Supplier;


public class AddSupplier extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		//商品的各个属�?
		
		String supplierid = request.getParameter("supplierid");
		String suppliername = request.getParameter("suppliername");
		String supplierhead = request.getParameter("supplierhead");
		String suppliertel = request.getParameter("suppliertel");
		String supplieraddress = request.getParameter("supplieraddress");
		String suppliernote = request.getParameter("suppliernote");
		
	
		ISupplierDao dao = new SupplierDaoImpl();
		Supplier supplier = new Supplier() ;
		int id = dao.getId() ;
		supplier.setSupplier(id);
		supplier.setSupplierid(Integer.parseInt(supplierid));
		supplier.setSuppliername(suppliername);
		supplier.setSupplierhead(supplierhead);
		supplier.setSuppliertel(suppliertel);
		supplier.setSupplieraddress(supplieraddress);
		supplier.setSuppliernote(suppliernote);
		int row = dao.addSupplier(supplier);
		if(row !=0){
			response.sendRedirect("managesupplier.jsp");
		}else{
			response.sendRedirect("null.jsp");
		}
	}

}
