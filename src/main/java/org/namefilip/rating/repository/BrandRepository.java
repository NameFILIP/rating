package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface BrandRepository extends CrudRepository<Brand, Long> {
	
}
