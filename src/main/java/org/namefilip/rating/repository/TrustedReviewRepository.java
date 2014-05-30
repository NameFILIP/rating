package org.namefilip.rating.repository;

import org.namefilip.rating.entity.TrustedReview;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface TrustedReviewRepository extends CrudRepository<TrustedReview, Long> {
	
}
