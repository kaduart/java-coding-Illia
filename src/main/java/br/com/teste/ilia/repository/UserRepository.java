package br.com.teste.ilia.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.ilia.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	@Query("select u from User u where u.login = ?1")
	User findUserByLogin(String login);
}
