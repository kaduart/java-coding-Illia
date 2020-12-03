package br.com.teste.ilia.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.authenticator.Constants;
import org.apache.tomcat.util.http.HeaderUtil;
import org.apache.tomcat.util.http.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.impl.LList;
import br.com.teste.ilia.entity.User;
import br.com.teste.ilia.repository.UserRepository;
import br.com.teste.ilia.service.UserService;
import br.com.teste.ilia.service.dto.UserDTO;

@RestController
@RequestMapping("/api")
public class UserController {

	private static final String ENTITY_NAME = "user";

	private UserService userService;
	

	@PostMapping(value = "/users/")
	public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
		UserDTO userSave = userService.createUser(userDTO);
		return new ResponseEntity<UserDTO>(userSave, HttpStatus.OK);
	}

	@PutMapping("/users/")
	public ResponseEntity<UserDTO> updateUser(@RequestBody UserDTO userDTO) {
		UserDTO userUpdate = userService.updateUser(userDTO);
		return new ResponseEntity<UserDTO>(userUpdate, HttpStatus.OK);
	}

	@GetMapping(value = "/users/")
	public ResponseEntity<List<User>> getAll() {
		User getUsers = userService.getAllUsers();
		return new ResponseEntity(getUsers, HttpStatus.OK);
	}

	@GetMapping(value = "/users/{id}")
	public ResponseEntity<User> getUserId(@PathVariable Long id) {
		Optional<User> getUser = userService.findById(id);
		return new ResponseEntity(getUser, HttpStatus.OK);
	}

	@DeleteMapping(value = "/users/{id}")
	public ResponseEntity<UserDTO> deleteUser(@PathVariable Long id) {
		userService.deleteUserById(id);
		return ResponseEntity.ok().headers(br.com.teste.ilia.controller.HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
	}
}
