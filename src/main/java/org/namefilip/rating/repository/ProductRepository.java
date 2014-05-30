package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface ProductRepository extends CrudRepository<Product, Long> {
	
}
