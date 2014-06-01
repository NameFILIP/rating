package org.namefilip.rating.repository;

import java.util.List;

import org.namefilip.rating.entity.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface CommentRepository extends CrudRepository<Comment, Long> {
	
	@Query("select c from Comment c where c.review.id = ?1")
	List<Comment> findByReviewId(Long reviewId);
	
}
