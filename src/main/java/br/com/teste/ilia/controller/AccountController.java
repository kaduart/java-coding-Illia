package br.com.teste.ilia.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;

public class AccountController {

	@GetMapping("/authenticate")
	public String isAuthenticated(HttpServletRequest request) {

		return request.getRemoteUser();
	}

}
