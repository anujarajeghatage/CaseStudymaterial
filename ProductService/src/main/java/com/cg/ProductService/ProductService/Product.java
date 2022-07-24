package com.cg.ProductService.ProductService;

public class Product {

	
	private int productid;
	private String productname;
	private String producttype;
	private double price;
	private String description;
	private String category;
	
	
	//empty constructor
	public Product() {
		
	}
	
	
	//constructor with fields
	
	public Product(int productid, String productname, String producttype, double price, String description,
			String category) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.producttype = producttype;
		this.price = price;
		this.description = description;
		this.category = category;
	}
	
	//getters and setters
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}


	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", producttype=" + producttype
				+ ", price=" + price + ", description=" + description + ", category=" + category + "]";
	}
	
	
	
}
