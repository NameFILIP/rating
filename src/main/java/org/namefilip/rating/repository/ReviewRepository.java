package org.namefilip.rating.repository;

import java.util.List;

import org.namefilip.rating.entity.Review;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface ReviewRepository extends CrudRepository<Review, Long> {
	
	@Query("select r from Review r where r.product.id = ?1")
	List<Review> findByProductId(Long productId);
}
