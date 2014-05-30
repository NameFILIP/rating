package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.TrustedReview;
import org.namefilip.rating.repository.TrustedReviewRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/trusted-reviews")
public class TrustedReviewApi {
	
	@Inject
	TrustedReviewRepository trustedReviewRepository;
	
	/**
	 * Get a list of trustedReviews
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<TrustedReview> listTrustedReviews() {
		return trustedReviewRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public TrustedReview saveTrustedReview(@RequestBody TrustedReview trustedReviewJson) {
		return trustedReviewRepository.save(trustedReviewJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{trustedReviewId}", method = RequestMethod.GET)
	public TrustedReview findTrustedReview(@PathVariable Long trustedReviewId) {
		return trustedReviewRepository.findOne(trustedReviewId);
	}
	
	@RequestMapping(value = "/{trustedReviewId}", method = RequestMethod.DELETE)
	public void deleteTrustedReview(@PathVariable Long trustedReviewId) {
		trustedReviewRepository.delete(trustedReviewId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{trustedReviewId}", method = RequestMethod.PUT)
	public TrustedReview updateTrustedReview(@RequestBody TrustedReview trustedReviewJson) {
		return trustedReviewRepository.save(trustedReviewJson);
	}
	
}
