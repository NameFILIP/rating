package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Subcategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface SubcategoryRepository extends CrudRepository<Subcategory, Long> {
	
}
