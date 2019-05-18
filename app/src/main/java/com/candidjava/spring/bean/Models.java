package com.candidjava.spring.bean;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@SuppressWarnings("serial")
@Document(collection = "models")
public class Models {

    @Id ObjectId databaseId;
    @Field("id")
    private String id;
    @Field("state_id")
    private String model;
    @Field("product_id")
    private int product_id;
    @Field("model_id")
    private int model_id;
    @Field("brand_id")
    private int brand_id;
    
	public Models(ObjectId databaseId, String id, String model, int product_id, int model_id, int brand_id) {
		super();
		this.databaseId = databaseId;
		this.id = id;
		this.model = model;
		this.product_id = product_id;
		this.model_id = model_id;
		this.brand_id = brand_id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
		this.brand_id = brand_id;
	}
    
	
}
