package org.namefilip.rating.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	private Long id;
	private String text;
	private Date timestamp;
	
	@ManyToOne
	@JoinColumn
	private Comment comment;
	
	
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
	
    public Comment getComment() {
    	return comment;
    }
	
    public void setComment(Comment comment) {
    	this.comment = comment;
    }
	
}
