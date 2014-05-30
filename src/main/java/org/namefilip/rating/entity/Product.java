package org.namefilip.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	
	@Id
	private Long id;
	private String name;
	private String model;
	
	@ManyToOne
	@JoinColumn
	private Brand brand;
	
	@ManyToOne
	@JoinColumn
	private Subcategory subcategory;
	
	
    public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
    }
	
    public String getName() {
    	return name;
    }
	
    public void setName(String name) {
    	this.name = name;
    }
	
    public String getModel() {
    	return model;
    }
	
    public void setModel(String model) {
    	this.model = model;
    }
	
    public Brand getBrand() {
    	return brand;
    }
	
    public void setBrand(Brand brand) {
    	this.brand = brand;
    }
	
    public Subcategory getSubcategory() {
    	return subcategory;
    }
	
    public void setSubcategory(Subcategory subcategory) {
    	this.subcategory = subcategory;
    }
	
}
