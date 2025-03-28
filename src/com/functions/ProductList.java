package com.functions;

public class ProductList {
	
	private String productType;
	
	private Double productPrice;
	
	private String productName;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductList(String productType, String productName, Double productPrice) {
		this.productType = productType;
		this.productPrice = productPrice;
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "ProductList [productType=" + productType + ", productPrice=" + productPrice + ", productName="
				+ productName + "]";
	}
	
	
	
	
	
	
	

}
