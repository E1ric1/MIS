package cn.cumt.shop.dao.impl;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cn.cumt.shop.dao.ISupplierDao;
import cn.cumt.shop.dbc.DBUtil;
import cn.cumt.shop.domain.Supplier;

public class SupplierDaoImpl implements ISupplierDao{

	@Override
	public Supplier findById(int supplierid)
	{
		// TODO Auto-generated method stub
		//ͨ通过供应商ID找供应商信息
		Supplier supplier = null ;
		String sql = "select * from supplier where supplierid = " + supplierid ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		try{
			st = conn.createStatement() ;
			rs = st.executeQuery(sql);
			while(rs.next()){
				String suppliername = rs.getString("suppliername") ;
				String supplierhead = rs.getString("supplierhead") ;
				String suppliertel = rs.getString("suppliertel") ;
				String supplieraddress = rs.getString("supplieraddress") ;
				String suppliernote= rs.getString("suppliernote") ;
				supplier = new Supplier(supplierid, suppliername, supplierhead, suppliertel, supplieraddress, suppliernote) ;
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return supplier ;
	}

	@Override
	public List<Supplier> findSupplier() throws Exception {
		// TODO Auto-generated method stub
		Supplier supplier = null ;
		String sql = "select * from supplier "  ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Supplier> list=new ArrayList<Supplier>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int supplierid = rs.getInt(2) ;
				String suppliername = rs.getString(3) ;
				String supplierhead = rs.getString(4) ;
				String suppliertel = rs.getString(5) ;
				String supplieraddress = rs.getString(6) ;
				String suppliernote = rs.getString(7) ;
				supplier = new Supplier(supplierid, suppliername, supplierhead, suppliertel, supplieraddress, suppliernote) ;
				list.add(supplier);
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	
	}

}
