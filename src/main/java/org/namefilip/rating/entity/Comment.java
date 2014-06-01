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
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;
	private String text;
	private Date timestamp;
	
	@ManyToOne
	@JoinColumn
	private User user;
	
	@JsonBackReference("comment-comment")
	@ManyToOne
	@JoinColumn
	private Comment comment;
	
	@JsonBackReference("review-comment")
	@ManyToOne
	@JoinColumn
	private Review review;
	
	@JsonManagedReference("comment-comment")
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "comment")
	private List<Comment> comments;
	
	
    public Long getId() {
    	return id;
    }
	
    public void setId(Long id) {
    	this.id = id;
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
    
    public User getUser() {
    	return user;
    }
	
    public void setUser(User user) {
    	this.user = user;
    }

	public Comment getComment() {
    	return comment;
    }
	
    public void setComment(Comment comment) {
    	this.comment = comment;
    }
	
    public Review getReview() {
    	return review;
    }

    public void setReview(Review review) {
    	this.review = review;
    }

	
    public List<Comment> getComments() {
    	return comments;
    }

	
    public void setComments(List<Comment> comments) {
    	this.comments = comments;
    }
	
}
