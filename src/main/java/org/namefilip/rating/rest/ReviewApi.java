package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Review;
import org.namefilip.rating.repository.ReviewRepository;
import org.springframework.stereotype.Controller;
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
	
	/**
	 * Get a list of reviews
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Review> listReviews() {
		return reviewRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Review saveReview(@RequestBody Review reviewJson) {
		return reviewRepository.save(reviewJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{reviewId}", method = RequestMethod.GET)
	public Review findReview(@PathVariable Long reviewId) {
		return reviewRepository.findOne(reviewId);
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
	
}
