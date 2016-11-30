package cn.cumt.shop.dao;


import java.util.List;


import cn.cumt.shop.domain.Order;

public interface IOrderDao {
	//添加一个订单ID
	public int getId() ;
	//添加订单
	public int addbuyorder(Order order) ;
	//通过ID查询订单
	public List<Order> findOrder(int orderid,int orderclassid) throws Exception;
	//删除订单
	public boolean DelOrder(int order);
	//查询订单
	public Order findorder(int goodid,int orderid) ;	
	//通过ID查询订单
	public List<Order> findOrder(int orderclassid) throws Exception;
	
}
