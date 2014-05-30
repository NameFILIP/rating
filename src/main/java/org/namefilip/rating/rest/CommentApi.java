package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Comment;
import org.namefilip.rating.repository.CommentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/comments")
public class CommentApi {
	
	@Inject
	CommentRepository commentRepository;
	
	/**
	 * Get a list of comments
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Comment> listComments() {
		return commentRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Comment saveComment(@RequestBody Comment commentJson) {
		return commentRepository.save(commentJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{commentId}", method = RequestMethod.GET)
	public Comment findComment(@PathVariable Long commentId) {
		return commentRepository.findOne(commentId);
	}
	
	@RequestMapping(value = "/{commentId}", method = RequestMethod.DELETE)
	public void deleteComment(@PathVariable Long commentId) {
		commentRepository.delete(commentId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{commentId}", method = RequestMethod.PUT)
	public Comment updateComment(@RequestBody Comment commentJson) {
		return commentRepository.save(commentJson);
	}
	
}
