package org.namefilip.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Subcategory {
	
	@Id
	private Long id;
	private String name;
	
	@ManyToOne
	@JoinColumn
	private Category category;


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

    public Category getCategory() {
    	return category;
    }

    public void setCategory(Category category) {
    	this.category = category;
    }
	
}
