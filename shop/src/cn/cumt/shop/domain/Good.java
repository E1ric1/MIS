package cn.cumt.shop.domain;
public class Good {
	private int good;  
	private int goodid;  
	private String goodname ; 
	private double buyprice ; 
	private double sellprice ; 
	private int goodamount ; 
	private String goodunit ; 
	private String goodclass ; 
	private String goodnote ; 
	public Good() {
		// TODO Auto-generated constructor stub
	}
	public Good(int goodid, String goodname, double buyprice, double sellprice, int goodamount, String goodunit,
			String goodclass, String goodnote) {
		// TODO Auto-generated constructor stub
		this.goodid = goodid ;
		this.goodname = goodname ;
		this.buyprice = buyprice ;
		this.sellprice = sellprice ;
		this.goodamount = goodamount ;
		this.goodunit = goodunit ;
		this.goodclass = goodclass ;
		this.goodnote = goodnote ;
	}
	

	public Good(int goodid, int goodamount) {
		// TODO Auto-generated constructor stub
		this.goodid = goodid ;
		this.goodamount = goodamount ;
	}
	public int getGood() {
		return good;
	}
	public void setGood(int good) {
		this.good = good;
	}
	public int getGoodid() {
		return goodid;
	}
	public void setGoodid(int goodid) {
		this.goodid = goodid;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	
	public double getBuyprice() {
		return buyprice;
	}
	public void setBuyprice(double buyprice) {
		this.buyprice = buyprice;
	}
	public double getSellprice() {
		return sellprice;
	}
	public void setSellprice(double sellprice) {
		this.sellprice = sellprice;
	}
	public int getGoodamount() {
		return goodamount;
	}
	public void setGoodamount(int goodamount) {
		this.goodamount = goodamount;
	}
	public String getGoodunit() {
		return goodunit;
	}
	public void setGoodunit(String goodunit) {
		this.goodunit = goodunit;
	}
	public String getGoodclass() {
		return goodclass;
	}
	public void setGoodclass(String goodclass) {
		this.goodclass = goodclass;
	}
	public String getGoodnote() {
		return goodnote;
	}
	public void setGoodnote(String goodnote) {
		this.goodnote = goodnote;
	}
	
	
}
