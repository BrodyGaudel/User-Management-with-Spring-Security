package tn.esprit.usermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.esprit.usermicroservice.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Role findByRolename(String rolename);

}
