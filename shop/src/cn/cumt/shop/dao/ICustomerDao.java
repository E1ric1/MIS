package cn.cumt.shop.dao;

import java.util.List;


import cn.cumt.shop.domain.Customer;


public interface ICustomerDao {
		//ͨ通过客户ID找客户信息
		public Customer findById(int customerid) ;
		//遍历客户信息
		public List<Customer> findCustomer() throws Exception;
		//获得ID
	    public int getId() ;
	    //添加客户
		public int addCustomer(Customer customer) ;
}
