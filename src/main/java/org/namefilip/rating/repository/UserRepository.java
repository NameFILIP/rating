package org.namefilip.rating.repository;

import org.namefilip.rating.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional(readOnly = true)
public interface UserRepository extends CrudRepository<User, Long> {
	
}
