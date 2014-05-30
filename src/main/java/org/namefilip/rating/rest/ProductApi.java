package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Product;
import org.namefilip.rating.repository.ProductRepository;
import org.springframework.stereotype.Controller;
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
	
	@ResponseBody
	@RequestMapping(value = "/{productId}", method = RequestMethod.GET)
	public Product findProduct(@PathVariable Long productId) {
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
	
}
