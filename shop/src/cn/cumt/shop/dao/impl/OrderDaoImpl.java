package cn.cumt.shop.dao.impl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;
import cn.cumt.shop.dbc.DBUtil;
import cn.cumt.shop.dao.IOrderDao;
import cn.cumt.shop.domain.Good;
import cn.cumt.shop.domain.Order;
public class OrderDaoImpl implements IOrderDao{

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		//获取订单的ID
				int id = 0 ;
				DBUtil db = new DBUtil() ;
				Connection conn = db.getConnection() ;
				Statement stmt = null ;
				ResultSet rs = null ;
				String sql = "select Max(`order`) from `order`" ;
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
	public int addbuyorder(Order order) {
		// TODO Auto-generated method stub
		//添加订单
		int id = order.getOrder();
		int orderid = order.getOrderid() ;
		int goodid = order.getGoodid() ;
		int orderclassid = order.getOrderclassid() ;
		int acount = order.getAcount() ;
		String time = order.getTime() ;
		String note = order.getNote() ;
		int customerid = order.getCustomerid() ;
		int row = 0 ;
		String sql = "INSERT INTO `order` (`order`, `orderid`, `orderclassid`, `goodid`, `acount`, `time`, `note`, `customerid`) VALUES ('"+id+"', '"+orderid+"', '"+orderclassid+"', '"+goodid+"', '"+acount+"', '"+time+"', '"+note+"', '"+customerid+"')";
		DBUtil db = new DBUtil() ;
		Connection conn =  db.getConnection() ;
		try{
			Statement stmt = conn.createStatement() ; 
			row = stmt.executeUpdate(sql) ;
			db.closeAll(conn, stmt, null);
		}catch(SQLException e ){
			e.printStackTrace();
		}
		return row ;
	}


	@Override
	public List<Order> findOrder(int orderid ,int orderclassid) throws Exception {
		// TODO Auto-generated method stub
		Order order = null ;
		String sql = "select * from `order` where `orderid` = " + orderid +" and `orderclassid` =" + orderclassid ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Order> list=new ArrayList<Order>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int goodid = rs.getInt(4) ;
				int acount = rs.getInt(5) ;
				String time = rs.getString(6) ;
				String note = rs.getString(7) ;
				int customerid = rs.getInt(8) ;
				int supplierid = rs.getInt(9) ;
				order = new Order(orderid,goodid, acount, time, note, customerid, supplierid) ;
				list.add(order);
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	@Override
	public boolean DelOrder(int order) {
		boolean flag = true ;
		String sql = "delete from `order` where `order` = "+ order ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ;
		try{
			conn.setAutoCommit(false);   
			st = conn.createStatement() ;
			st.addBatch(sql);
			st.executeBatch() ;
			conn.setAutoCommit(true);  
		}catch(SQLException e){
			flag = false ;
			try{
				conn.rollback();
			}catch(SQLException e1){
				e1.printStackTrace();
			}
		}finally{
			db.closeAll(conn, st, null);
		}
		return flag ;
	}

	@Override
	public Order findorder(int goodid, int orderid) {
		// TODO Auto-generated method stub
				//ͨ通过订单ID找商品信息
				Order o = null ;
				String sql = "select * from `order` where `goodid` = " + goodid + " and `orderid` =" +orderid ;
				DBUtil db = new DBUtil() ;
				Connection conn = db.getConnection() ;
				Statement st = null ; 
				ResultSet rs = null ;
				try{
					st = conn.createStatement() ;
					rs = st.executeQuery(sql);
					while(rs.next()){
						int order = rs.getInt("order");
						int acount = rs.getInt("acount") ;
						String time = rs.getString("time");
						String note = rs.getString("note");
						int customerid = rs.getInt("customerid") ;
						int supplierid = rs.getInt("supplierid") ;
						o = new Order(order,orderid, goodid, acount,time,note,customerid,supplierid) ;
					}
					db.closeAll(conn, st, rs);
				}catch(SQLException e){
					e.printStackTrace();
				}
				return o ;
	}

	@Override
	public List<Order> findOrder(int orderclassid) throws Exception {
		// TODO Auto-generated method stub
		Order order = null ;
		String sql = "select * from `order` where `orderclassid` = " + orderclassid ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Order> list=new ArrayList<Order>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int orderid = rs.getInt(2);
				int goodid = rs.getInt(4) ;
				int acount = rs.getInt(5) ;
				String time = rs.getString(6) ;
				String note = rs.getString(7) ;
				int customerid = rs.getInt(8) ;
				int supplierid = rs.getInt(9) ;
				order = new Order(orderid,goodid, acount, time, note, customerid, supplierid) ;
				list.add(order);
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
}
