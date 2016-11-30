package cn.cumt.shop.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.cumt.shop.dao.ICustomerDao;
import cn.cumt.shop.dbc.DBUtil;
import cn.cumt.shop.domain.Customer;



public class CustomerDaoImpl implements ICustomerDao{

	@Override
	public Customer findById(int customerid) {
		// TODO Auto-generated method stub
		//ͨ通过客户ID找客户信�?
		Customer customer = null ;
		String sql = "select * from customer where customerid = " + customerid ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		try{
			st = conn.createStatement() ;
			rs = st.executeQuery(sql);
			while(rs.next()){
				String customername = rs.getString("customername") ;
				String customertel= rs.getString("customertel") ;
				String customeraddress = rs.getString("customeraddress") ;
				String customernote= rs.getString("customernote") ;
				customer = new Customer(customerid, customername, customertel,customeraddress, customernote) ;
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return customer ;
	}
	@Override
	public List<Customer> findCustomer() throws Exception {
		// TODO Auto-generated method stub
		Customer customer = null ;
		String sql = "select * from customer "  ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Customer> list=new ArrayList<Customer>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int customerid = rs.getInt(2) ;
				String customername = rs.getString(3) ;
				String customertel = rs.getString(4) ;
				String customeraddress = rs.getString(5) ;
				String customernote = rs.getString(6) ;
				customer = new Customer(customerid, customername, customertel, customeraddress, customernote) ;
				list.add(customer);
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	@Override
	public int getId() {
		//ID
		int id = 0 ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement stmt = null ;
		ResultSet rs = null ;
		String sql = "select Max(customer) from customer" ;
		try{
			stmt = conn.createStatement() ;
			rs = stmt.executeQuery(sql) ;
			if(rs.next()){
				id = rs.getInt(1) ;
			}
			db.closeAll(conn, stmt, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		id++ ;
		return id ;
	}
	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		//添加商品
		int id = customer.getCustomer() ;
		int customerid = customer.getCustomerid() ;
		String customername = customer.getCustomername() ;
		String customertel = customer.getCustomertel() ;
		String customeraddress= customer.getCustomeraddress() ;
		String customernote = customer.getCustomernote() ;
		int row = 0 ;
		String sql = "insert customer (customer,customerid,customername,customertel,customeraddress,customernote) values ('"+id+"','"+customerid+"','"+customername+"','"+customertel+"','"+customeraddress+"','"+customernote+"')" ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		try{
			Statement stmt = conn.createStatement() ; 
			row = stmt.executeUpdate(sql) ;
			db.closeAll(conn, stmt, null);
		}catch(SQLException e ){
			e.printStackTrace();
		}
		return row ;		
	}
}
