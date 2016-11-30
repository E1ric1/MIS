package cn.cumt.shop.domain;
public class Customer {
	private int customer; 
	private int customerid;  
	private String customername ; 
	private String customertel ; 
	private String customeraddress ;
	private String customernote ; 
	public Customer(int customerid, String customername, String customertel, String customeraddress,
			String customernote) {
		// TODO Auto-generated constructor stub
		this.customerid = customerid ;
		this.customername = customername ;
		this.customertel = customertel ;
		this.customeraddress = customeraddress ;
		this.customernote = customernote ;
	}
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public int getCustomer() {
		return customer;
	}

	public void setCustomer(int customer) {
		this.customer = customer;
	}

	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomertel() {
		return customertel;
	}
	public void setCustomertel(String customertel) {
		this.customertel = customertel;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomernote() {
		return customernote;
	}
	public void setCustomernote(String customernote) {
		this.customernote = customernote;
	}
	
}
