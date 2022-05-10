package tn.esprit.usermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.usermicroservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
