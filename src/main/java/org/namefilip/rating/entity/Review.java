package org.namefilip.rating.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private Integer grade;
	private String pros;
	private String cons;
	private String text;
	private Date timestamp;
	
	@JsonBackReference("product-review")
	@ManyToOne
	@JoinColumn
	private Product product;
	
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@JsonManagedReference("review-comment")
	@OneToMany(fetch=FetchType.LAZY, cascade = CascadeType.ALL, mappedBy="review")
	private List<Comment> comments;
	
	
    public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
    }
    
    public Integer getGrade() {
    	return grade;
    }

    public void setGrade(Integer grade) {
    	this.grade = grade;
    }

    public String getPros() {
    	return pros;
    }

    public void setPros(String pros) {
    	this.pros = pros;
    }
	
    public String getCons() {
    	return cons;
    }
	
    public void setCons(String cons) {
    	this.cons = cons;
    }
	
    public String getText() {
    	return text;
    }
	
    public void setText(String text) {
    	this.text = text;
    }

    public Date getTimestamp() {
    	return timestamp;
    }
	
    public void setTimestamp(Date timestamp) {
    	this.timestamp = timestamp;
    }

	public Product getProduct() {
    	return product;
    }
	
    public void setProduct(Product product) {
    	this.product = product;
    }
	
    public User getUser() {
    	return user;
    }
	
    public void setUser(User user) {
    	this.user = user;
    }

	
    public List<Comment> getComments() {
    	return comments;
    }

	
    public void setComments(List<Comment> comments) {
    	this.comments = comments;
    }
	
}
