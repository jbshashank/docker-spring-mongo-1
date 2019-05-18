package com.candidjava.spring.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@SuppressWarnings("serial")
@Document(collection = "product_category")
public class Product_category {

    @Id ObjectId databaseId;
    @Field("id")
    private String id;
    @Field("product")
    private String product;
    @Field("brand_id")
    private String brand_id;
    @Field("product_id")
    private String product_id;
    
    
	public Product_category(ObjectId databaseId, String id, String product, String brand_id, String product_id) {
		super();
		this.databaseId = databaseId;
		this.id = id;
		this.product = product;
		this.brand_id = brand_id;
		this.product_id = product_id;
	}
	
	public ObjectId getDatabaseId() {
		return databaseId;
	}
	public void setDatabaseId(ObjectId databaseId) {
		this.databaseId = databaseId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(String brand_id) {
		this.brand_id = brand_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}    
}
