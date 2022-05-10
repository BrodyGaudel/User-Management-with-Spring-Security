package tn.esprit.usermicroservice.service;

import tn.esprit.usermicroservice.entities.Role;
import tn.esprit.usermicroservice.entities.User;

public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
