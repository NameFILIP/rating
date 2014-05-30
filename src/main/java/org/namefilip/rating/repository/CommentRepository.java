package org.namefilip.rating.repository;

import org.namefilip.rating.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface CommentRepository extends CrudRepository<Comment, Long> {
	
}
