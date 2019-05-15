package com.GrizzlyStore.Model;

public class AddProduct {
	Integer productID;
	String productName;
	String category;
	String description;
	Float price;
	Float rating;
	String brand;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getRating() {
		return rating;
	}
	public void setRating(Float rating) {
		this.rating = rating;
	}
	public AddProduct(Integer productID, String productName, String category, String description, Float price,
			Float rating) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.price = price;
		this.rating = rating;
	}
	public AddProduct(Integer productID, String productName, String brand, String category, String description, Float price,
			Float rating) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.category = category;
		this.description = description;
		this.price = price;
		this.rating = rating;
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public AddProduct() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
