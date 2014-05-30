package org.namefilip.rating.rest;

import javax.inject.Inject;

import org.namefilip.rating.entity.Brand;
import org.namefilip.rating.repository.BrandRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/brands")
public class BrandApi {
	
	@Inject
	BrandRepository brandRepository;
	
	/**
	 * Get a list of brands
	 */
	@ResponseBody
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<Brand> listBrands() {
		return brandRepository.findAll();
	}
	
	@ResponseBody
	@RequestMapping(method = RequestMethod.POST)
	public Brand saveBrand(@RequestBody Brand brandJson) {
		return brandRepository.save(brandJson);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{brandId}", method = RequestMethod.GET)
	public Brand findBrand(@PathVariable Long brandId) {
		return brandRepository.findOne(brandId);
	}
	
	@RequestMapping(value = "/{brandId}", method = RequestMethod.DELETE)
	public void deleteBrand(@PathVariable Long brandId) {
		brandRepository.delete(brandId);
	}
	
	@ResponseBody
	@RequestMapping(value = "/{brandId}", method = RequestMethod.PUT)
	public Brand updateBrand(@RequestBody Brand brandJson) {
		return brandRepository.save(brandJson);
	}
	
}
