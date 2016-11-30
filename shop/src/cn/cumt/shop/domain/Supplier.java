package cn.cumt.shop.domain;

public class Supplier {
	private int supplierid;  
	private String suppliername ; 
	private String supplierhead ; 
	private String suppliertel ; 
	private String supplieraddress;
	private String suppliernote;

	public Supplier(int supplierid, String suppliername, String supplierhead, String suppliertel,
			String supplieraddress, String suppliernote) {
		// TODO Auto-generated constructor stub
		this.supplierid = supplierid ;
		this.suppliername = suppliername ;
		this.supplierhead = supplierhead ;
		this.suppliertel = suppliertel ;
		this.supplieraddress = supplieraddress ;
		this.suppliernote = suppliernote ;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplierhead() {
		return supplierhead;
	}
	public void setSupplierhead(String supplierhead) {
		this.supplierhead = supplierhead;
	}
	public String getSuppliertel() {
		return suppliertel;
	}
	public void setSuppliertel(String suppliertel) {
		this.suppliertel = suppliertel;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	public String getSuppliernote() {
		return suppliernote;
	}
	public void setSuppliernote(String suppliernote) {
		this.suppliernote = suppliernote;
	}
	
}
