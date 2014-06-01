package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	@Query("select avg(r.grade) from Review r where r.product.id = ?1")
	Double calculateRating(Long productId);
}
