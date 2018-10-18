package com.refugio.web.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class CustomControllerAdvice {

	@ModelAttribute("username")
	public String mensajeUsuario(Principal principal) {
		//si principal viene nulo, quiere decir
		//que el usuario jamas inici� sesi�n
		
		if(principal!=null) {
			//obtenemos el nombre del usuario
			//autenticado
			return principal.getName();
		}
		
		return "";
	}
	
}
