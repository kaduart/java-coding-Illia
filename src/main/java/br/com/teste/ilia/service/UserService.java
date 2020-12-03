package br.com.teste.ilia.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.teste.ilia.entity.User;
import br.com.teste.ilia.mapper.UserMapper;
import br.com.teste.ilia.repository.UserRepository;
import br.com.teste.ilia.service.dto.UserDTO;

public class UserService {

	private UserMapper userMapper;

	@Autowired
	private UserRepository userRepository;

	public UserDTO createUser(UserDTO userDTO) {

		User user = userMapper.toEntity(userDTO);
		user = userRepository.save(user);
		return userMapper.toDto(user);
	}

	public UserDTO updateUser(UserDTO userDTO) {
		User user = userMapper.toEntity(userDTO);
		user = userRepository.save(user);
		return userMapper.toDto(user);
	}

	public User getAllUsers() {

		return (User) userRepository.findAll();
	}

	public Optional<User> findById(Long id) {

		return userRepository.findById(id);
	}

	public void deleteUserById(Long id) {

		userRepository.deleteById(id);
	}

}
