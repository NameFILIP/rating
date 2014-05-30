package org.namefilip.rating.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "Trusted_Review")
public class TrustedReview {
	
	@Id
	private Long id;
	private Boolean trusted;
	
	@ManyToOne
	@JoinColumn
	private Review review;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	
    public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Boolean getTrusted() {
    	return trusted;
    }
	
    public void setTrusted(Boolean trusted) {
    	this.trusted = trusted;
    }
	
    public Review getReview() {
    	return review;
    }
	
    public void setReview(Review review) {
    	this.review = review;
    }
	
    public User getUser() {
    	return user;
    }
	
    public void setUser(User user) {
    	this.user = user;
    }
	
}
