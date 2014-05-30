package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Category;
import org.namefilip.rating.repository.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/categories")
public class CategoryApi {
	
	@Inject
	CategoryRepository categoryRepository;
	
	/**
	 * Get a list of categories
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Category> listCategories() {
		return categoryRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Category saveCategory(@RequestBody Category categoryJson) {
		return categoryRepository.save(categoryJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{categoryId}", method = RequestMethod.GET)
	public Category findCategory(@PathVariable Long categoryId) {
		return categoryRepository.findOne(categoryId);
	}
	
	@RequestMapping(value = "/{categoryId}", method = RequestMethod.DELETE)
	public void deleteCategory(@PathVariable Long categoryId) {
		categoryRepository.delete(categoryId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{categoryId}", method = RequestMethod.PUT)
	public Category updateCategory(@RequestBody Category categoryJson) {
		return categoryRepository.save(categoryJson);
	}
	
}
