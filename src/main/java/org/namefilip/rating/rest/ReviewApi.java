package org.namefilip.rating.rest;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Hibernate;
import org.namefilip.rating.entity.Comment;
import org.namefilip.rating.entity.Review;
import org.namefilip.rating.entity.User;
import org.namefilip.rating.repository.CommentRepository;
import org.namefilip.rating.repository.ReviewRepository;
import org.namefilip.rating.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/reviews")
public class ReviewApi {
	
	@Inject
	ReviewRepository reviewRepository;
	
	@Inject
	CommentRepository commentRepository;
	
//	@Inject
//	ProductRepository productRepository;
	
	@Inject
	UserRepository userRepository;
	
	/**
	 * Get a list of reviews
	 */
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.GET, params = "product")
//	public Iterable<Review> listReviews(@RequestParam("product") Long productId) {
//		return reviewRepository.findByProductId(productId);
//	}
//
//	@ResponseBody
//	@RequestMapping(method = RequestMethod.POST, params = "product")
//	public Review saveReview(@RequestBody Review reviewJson, @RequestParam("product") Long productId) {
//		Product product = productRepository.findOne(productId);
//		reviewJson.setProduct(product);
//		return reviewRepository.save(reviewJson);
//	}
	
	@Transactional(readOnly = true)
	@ResponseBody
	@RequestMapping(value = "/{reviewId}", method = RequestMethod.GET)
	public Review findReview(@PathVariable Long reviewId) {
		Review review = reviewRepository.findOne(reviewId);
		Hibernate.initialize(review.getComments());
		return review;
	}
	
	@RequestMapping(value = "/{reviewId}", method = RequestMethod.DELETE)
	public void deleteReview(@PathVariable Long reviewId) {
		reviewRepository.delete(reviewId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{reviewId}", method = RequestMethod.PUT)
	public Review updateReview(@RequestBody Review reviewJson) {
		return reviewRepository.save(reviewJson);
	}
	
	/**
	 * List comments for a review
	 */
	@ResponseBody
	@RequestMapping(value = "/{reviewId}/comments", method = RequestMethod.GET)
	public List<Comment> listComments(@PathVariable Long reviewId) {
		return commentRepository.findByReviewId(reviewId);
	}
	
	/**
	 * Add comment to a review
	 */
	@ResponseBody
	@RequestMapping(value = "/{reviewId}/comments", method = RequestMethod.POST)
	public Comment addComment(@PathVariable Long reviewId, @RequestBody Comment commentJson) {
		Review review = reviewRepository.findOne(reviewId);
		commentJson.setReview(review);
		
		Long userId = commentJson.getUser().getId();
		User user = userRepository.findOne(userId);
		commentJson.setUser(user);
		return commentRepository.save(commentJson);
	}
	
}
