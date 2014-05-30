package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Subcategory;
import org.namefilip.rating.repository.SubcategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/subcategories")
public class SubcategoryApi {
	
	@Inject
	SubcategoryRepository subcategoryRepository;
	
	/**
	 * Get a list of subcategories
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Subcategory> listSubcategories() {
		return subcategoryRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Subcategory saveSubcategory(@RequestBody Subcategory subcategoryJson) {
		return subcategoryRepository.save(subcategoryJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{subcategoryId}", method = RequestMethod.GET)
	public Subcategory findSubcategory(@PathVariable Long subcategoryId) {
		return subcategoryRepository.findOne(subcategoryId);
	}
	
	@RequestMapping(value = "/{subcategoryId}", method = RequestMethod.DELETE)
	public void deleteSubcategory(@PathVariable Long subcategoryId) {
		subcategoryRepository.delete(subcategoryId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{subcategoryId}", method = RequestMethod.PUT)
	public Subcategory updateSubcategory(@RequestBody Subcategory subcategoryJson) {
		return subcategoryRepository.save(subcategoryJson);
	}
	
}