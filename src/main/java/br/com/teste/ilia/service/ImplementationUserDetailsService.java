package br.com.teste.ilia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.teste.ilia.entity.User;
import br.com.teste.ilia.repository.UserRepository;

@Service
public class ImplementationUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findUserByLogin(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("Usuario não foi encontrado");
		}
		
		return new org.springframework.security.core.userdetails.User(user.getLogin(), 
																	  user.getPassword(), 
																	  user.getAuthorities());
		}

}
