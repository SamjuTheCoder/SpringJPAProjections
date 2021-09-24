package com.jpaprojection.tutorial.projection;

//projection class for selecting unique columns
//in our projection we intend to query only three columns
public class ProductProjection {
	
	String productName;
	String category;
	int price;
	
	//define public constructurs
	public ProductProjection(String productName, String category, int price) {
		super();
		this.productName = productName;
		this.category = category;
		this.price = price;
	}

	//getter and setters
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
