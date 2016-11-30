package cn.cumt.shop.domain;

public class Order {
	private int order; 
	private int orderid; 
	private int  orderclassid; 
	private int goodid ; 
	private int acount ; 
	private String  time ; 
	private String note ; 
	private int customerid ; 
	private int supplierid ; 
	
	public Order(int orderid, int goodid, int acount, String time, String note, int customerid, int supplierid) {
		// TODO Auto-generated constructor stub
		this.orderid = orderid ;
		this.goodid = goodid ;
		this.acount = acount ;
		this.time = time ;
		this.note = note ;
		this.customerid = customerid ;
		this.supplierid = supplierid ;
	}
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(int order, int orderid, int goodid, int acount, String time, String note, int customerid,
			int supplierid) {
		// TODO Auto-generated constructor stub
		this.order = order ;
		this.orderid = orderid ;
		this.goodid = goodid ;
		this.acount = acount ;
		this.time = time ;
		this.note = note ;
		this.customerid = customerid ;
		this.supplierid = supplierid ;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getOrderclassid() {
		return orderclassid;
	}
	public void setOrderclassid(int orderclassid) {
		this.orderclassid = orderclassid;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public int getAcount() {
		return acount;
	}
	public void setAcount(int acount) {
		this.acount = acount;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

}
