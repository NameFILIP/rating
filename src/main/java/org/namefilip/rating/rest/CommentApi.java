package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Comment;
import org.namefilip.rating.entity.User;
import org.namefilip.rating.repository.CommentRepository;
import org.namefilip.rating.repository.UserRepository;
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
	
	@Inject
	UserRepository userRepository;
	
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
	
	/**
	 * Add comment to a comment
	 * 
	 * @param commentId - parent comment id
	 * @param commentJson - new comment
	 * @return saved comment
	 */
	@ResponseBody
	@RequestMapping(value = "/{commentId}/comments", method = RequestMethod.POST)
	public Comment addComment(@PathVariable Long commentId, @RequestBody Comment commentJson) {
		Comment comment = commentRepository.findOne(commentId);
		commentJson.setComment(comment);
		
		Long userId = commentJson.getUser().getId();
		User user = userRepository.findOne(userId);
		commentJson.setUser(user);
		
		return commentRepository.save(commentJson);
	}
	
}
