package cn.cumt.shop.dao;


import java.util.List;


import cn.cumt.shop.domain.Order;

public interface IOrderDao {
	//添加一个订单ID
	public int getId() ;
	//添加订单
	public int addbuyorder(Order order) ;
	public int addsellorder(Order order) ;
	//删除订单
	public boolean DelOrder(int orderid);
	//查询订单
	public Order findorder(int orderid) ;	
	//查询订单
	public Order findorder1(int order) ;
	//通过ID查询订单
	public List<Order> findOrder(int orderclassid) throws Exception;
	//查询订单
	public List<Order> foundOrder3(int orderid,int orderclassid) throws Exception;
	//查询订单
	public List<Order> foundOrder1(int supplierid,int orderclassid) throws Exception;
	//查询订单
	public List<Order> foundOrder2(int customerid,int orderclassid) throws Exception;
	//查询订单
public List<Order> foundOrder(int order,int orderclassid) throws Exception;

}
