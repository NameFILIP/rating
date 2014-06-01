package org.namefilip.rating.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String gtin;
	
	@ManyToOne
	@JoinColumn
	private Brand brand;
	
	@ManyToOne
	@JoinColumn
	private Category category;
	
	@JsonManagedReference("product-review")
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "product")
	private List<Review> reviews;
	
	
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
	
    public String getGtin() {
    	return gtin;
    }

    public void setGtin(String gtin) {
    	this.gtin = gtin;
    }

	public Brand getBrand() {
    	return brand;
    }
	
    public void setBrand(Brand brand) {
    	this.brand = brand;
    }
	
    public Category getCategory() {
    	return category;
    }
	
    public void setCategory(Category category) {
    	this.category = category;
    }

	
    public List<Review> getReviews() {
    	return reviews;
    }

	
    public void setReviews(List<Review> reviews) {
    	this.reviews = reviews;
    }
	
}
