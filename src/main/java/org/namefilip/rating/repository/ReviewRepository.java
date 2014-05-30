package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface ReviewRepository extends CrudRepository<Review, Long> {
	
}
