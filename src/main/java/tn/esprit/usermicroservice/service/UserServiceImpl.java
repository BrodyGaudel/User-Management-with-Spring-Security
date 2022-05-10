package tn.esprit.usermicroservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.usermicroservice.entities.Role;
import tn.esprit.usermicroservice.entities.User;
import tn.esprit.usermicroservice.repository.RoleRepository;
import tn.esprit.usermicroservice.repository.UserRepository;


@Transactional
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired(required=true)
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public User findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public User addRoleToUser(String username, String rolename) {
		User user = userRepository.findByUsername(username);
		Role role = roleRepository.findByRolename(rolename);
		user.getRoles().add(role);
		return user;
	}

}
