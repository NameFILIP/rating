package org.namefilip.rating.rest;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Hibernate;
import org.namefilip.rating.entity.Product;
import org.namefilip.rating.entity.Review;
import org.namefilip.rating.entity.User;
import org.namefilip.rating.repository.ProductRepository;
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
@RequestMapping("/products")
public class ProductApi {
	
	@Inject
	ProductRepository productRepository;
	
	@Inject
	ReviewRepository reviewRepository;
	
	@Inject
	UserRepository userRepository;
	
	/**
	 * Get a list of products
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Product> listProducts() {
		return productRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Product saveProduct(@RequestBody Product productJson) {
		return productRepository.save(productJson);
	}
	
	@Transactional(readOnly = true)
	@ResponseBody
	@RequestMapping(value = "/{productId}", method = RequestMethod.GET)
	public Product findProduct(@PathVariable Long productId) {
		Product product = productRepository.findOne(productId);
		Hibernate.initialize(product.getReviews());
		return productRepository.findOne(productId);
	}
	
	@RequestMapping(value = "/{productId}", method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable Long productId) {
		productRepository.delete(productId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{productId}", method = RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product productJson) {
		return productRepository.save(productJson);
	}
	
	/**
	 * Reviews
	 */
//	@Transactional(readOnly = true)
	@ResponseBody
	@RequestMapping(value = "/{productId}/reviews", method = RequestMethod.GET)
	public List<Review> listReviews(@PathVariable Long productId) {
		return reviewRepository.findByProductId(productId);
//		return productRepository.findOne(productId).getReviews();
//		return reviewRepository.findByProductId(productId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{productId}/reviews", method = RequestMethod.POST)
	public Review saveReview(@PathVariable Long productId, @RequestBody Review reviewJson) {
		Product product = productRepository.findOne(productId);
		reviewJson.setProduct(product);
		
		Long userId = reviewJson.getUser().getId();
		User user = userRepository.findOne(userId);
		reviewJson.setUser(user);
		return reviewRepository.save(reviewJson);
	}
	
//	@ResponseBody
//	@RequestMapping(value = "/{productId}/reviews/{reviewId}", method = RequestMethod.GET)
//	public Review findReview(@PathVariable Long productId, @PathVariable Long reviewId) {
//		return reviewRepository.findOne(reviewId);
//	}
//
//	@RequestMapping(value = "/{productId}/reviews/{reviewId}", method = RequestMethod.DELETE)
//	public void deleteReview(@PathVariable Long productId, @PathVariable Long reviewId) {
//		reviewRepository.delete(reviewId);
//	}
//
//	@ResponseBody
//	@RequestMapping(value = "/{productId}/reviews/{reviewId}", method = RequestMethod.PUT)
//	public Review updateReview(@PathVariable Long productId, @RequestBody Review reviewJson) {
//		return reviewRepository.save(reviewJson);
//	}
	
	/**
	 * Rating
	 */
	@ResponseBody
	@RequestMapping(value = "/{productId}/rating", method = RequestMethod.GET)
	public Double calculateRating(@PathVariable Long productId) {
		return productRepository.calculateRating(productId);
	}
	
}
