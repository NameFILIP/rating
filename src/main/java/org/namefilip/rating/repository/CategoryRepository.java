package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface CategoryRepository extends CrudRepository<Category, Long> {
	
}
