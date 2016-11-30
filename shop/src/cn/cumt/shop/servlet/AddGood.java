package cn.cumt.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.cumt.shop.dao.IGoodDao;
import cn.cumt.shop.dao.impl.GoodDaoImpl;
import cn.cumt.shop.domain.Good;

public class AddGood extends HttpServlet {
	private static final long serialVersionUID = 1L ; //用来表明类的不同版本间的兼容�?
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws 
		ServletException,IOException{
		doPost(request,response);
	}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws
		ServletException,IOException{
		request.setCharacterEncoding("utf-8");
		//商品的各个属�?
		
		String goodid = request.getParameter("goodid");
		String goodname = request.getParameter("goodname");
		String buyprice = request.getParameter("buyprice");
		String sellprice = request.getParameter("sellprice");
		String goodamount = request.getParameter("goodamount");
		String goodunit = request.getParameter("goodunit");
		String goodclass = request.getParameter("goodclass");
		String goodnote = request.getParameter("goodnote");
		
	
		IGoodDao dao = new GoodDaoImpl();
		Good good = new Good() ;
		int id = dao.getId() ;
		good.setGood(id);
		good.setGoodid(Integer.parseInt(goodid));
		good.setGoodname(goodname);
		good.setBuyprice(Double.parseDouble(buyprice)); //字符串转换为double
		good.setSellprice(Double.parseDouble(sellprice)); 
		good.setGoodamount(Integer.parseInt(goodamount)); //String字符类型数据转换为Integer整型数据
		good.setGoodunit(goodunit);
		good.setGoodclass(goodclass);
		good.setGoodnote(goodnote);
		int row = dao.addGood(good);
		String msg ;
		if(row !=0){
			msg="成功" ;
		}else{
			msg="失败" ;
		}
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("managegood.jsp").forward(request, response);
	}

}
