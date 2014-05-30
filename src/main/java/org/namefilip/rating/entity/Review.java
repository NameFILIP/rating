package org.namefilip.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	private Long id;
	
	private Integer rating;
	
	@ManyToOne
	@JoinColumn
	private Product product;
	
	@ManyToOne
	@JoinColumn
	private Comment comment;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	
    public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Integer getRating() {
    	return rating;
    }

    public void setRating(Integer rating) {
    	this.rating = rating;
    }

	public Product getProduct() {
    	return product;
    }
	
    public void setProduct(Product product) {
    	this.product = product;
    }
	
    public Comment getComment() {
    	return comment;
    }
	
    public void setComment(Comment comment) {
    	this.comment = comment;
    }
	
    public User getUser() {
    	return user;
    }
	
    public void setUser(User user) {
    	this.user = user;
    }
	
}
