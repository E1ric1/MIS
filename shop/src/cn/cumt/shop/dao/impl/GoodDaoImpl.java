package cn.cumt.shop.dao.impl;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.PreparedStatement;
import cn.cumt.shop.dao.IGoodDao;
import cn.cumt.shop.dbc.DBUtil;
import cn.cumt.shop.domain.Good;
public class GoodDaoImpl implements IGoodDao{
	@Override
	public Good findById(int goodid) 
	{
		// TODO Auto-generated method stub
		//ͨ通过商品ID找商品信息
		Good good = null ;
		String sql = "select * from good where goodid = " + goodid ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		try{
			st = conn.createStatement() ;
			rs = st.executeQuery(sql);
			while(rs.next()){
				String goodname = rs.getString("goodname") ;
				double buyprice = rs.getDouble("buyprice") ;
				double sellprice = rs.getDouble("sellprice") ;
				int goodamount = rs.getInt("goodamount") ;
				String goodunit = rs.getString("goodunit") ;
				String goodclass = rs.getString("goodclass") ;
				String goodnote= rs.getString("goodnote") ;
				good = new Good(goodid, goodname, buyprice,sellprice,goodamount, goodunit, goodclass, goodnote) ;
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return good ;
	}

	@Override
	public int addGood(Good good) {
		// TODO Auto-generated method stub
		//添加商品
		int id = good.getGood() ;
		int goodid = good.getGoodid() ;
		String goodname = good.getGoodname() ;
		double buyprice = good.getBuyprice() ;
		double sellprice = good.getSellprice() ;
		int goodamount = good.getGoodamount() ;
		String goodunit = good.getGoodunit() ;
		String goodclass = good.getGoodclass() ;
		String goodnote = good.getGoodnote() ;
		int row = 0 ;
		String sql = "insert good (good,goodid,goodname,buyprice,sellprice,goodamount,goodunit,goodclass,goodnote) values ('"+id+"','"+goodid+"','"+goodname+"','"+buyprice+"','"+sellprice+"','"+goodamount+"','"+goodunit+"','"+goodclass+"','"+goodnote+"')" ;
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

	public List<Good> findGood() throws Exception{
		Good good = null ;
		String sql = "select * from good "  ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Good> list=new ArrayList<Good>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int goodid = rs.getInt(2) ;
				String goodname = rs.getString(3) ;
				double buyprice = rs.getDouble(4) ;
				double sellprice = rs.getDouble(5) ;
				int goodamount = rs.getInt(6) ;
				String goodunit = rs.getString(7) ;
				String goodclass = rs.getString(8) ;
				String goodnote = rs.getString(9) ;
				good = new Good(goodid, goodname, buyprice, sellprice, goodamount, goodunit, goodclass, goodnote) ;
				list.add(good);
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
		String sql = "select Max(Good) from good" ;
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
	public int udateBuyGood(int number,int goodid) {
		//采购添加库存
		int row = 0 ;
		String sql ="update good set goodamount='"+number+"' where goodid = "+goodid ;
		DBUtil db = new DBUtil() ;
		Connection conn =db.getConnection() ;
		Statement st ;
		try{
			st = conn.createStatement() ;
			row = st.executeUpdate(sql) ;
			db.closeAll(conn, st, null);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return row ;
	}

	@Override
	public List<Good> foundGood() throws Exception {
		// TODO Auto-generated method stub
		Good good = null ;
		String sql = "select * from good where goodamount<50"  ;
		DBUtil db = new DBUtil() ;
		Connection conn = db.getConnection() ;
		Statement st = null ; 
		ResultSet rs = null ;
		List<Good> list=new ArrayList<Good>(); 
		try{
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()){
				int goodid = rs.getInt(2) ;
				String goodname = rs.getString(3) ;
				double buyprice = rs.getDouble(4) ;
				double sellprice = rs.getDouble(5) ;
				int goodamount = rs.getInt(6) ;
				String goodunit = rs.getString(7) ;
				String goodclass = rs.getString(8) ;
				String goodnote = rs.getString(9) ;
				good = new Good(goodid, goodname, buyprice, sellprice, goodamount, goodunit, goodclass, goodnote) ;
				list.add(good);
			}
			db.closeAll(conn, st, rs);
		}catch(SQLException e){
			e.printStackTrace();
		}
		return list;
	}
}
