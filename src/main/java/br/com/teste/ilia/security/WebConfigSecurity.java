package br.com.teste.ilia.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import br.com.teste.ilia.service.ImplementationUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebConfigSecurity extends WebSecurityConfigurerAdapter {

	@Autowired
	private ImplementationUserDetailsService implementationUserDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.cors()
				.disable().authorizeRequests().antMatchers("/").permitAll().antMatchers("/index").permitAll()

				.anyRequest().authenticated().and().logout().logoutSuccessUrl("/index")

				.logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(implementationUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
	}
}
