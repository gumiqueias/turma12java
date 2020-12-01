package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller 
{
	@GetMapping ("/get2")
	public String hello2 () {
		return "Objetivos de aprendizado da semana:\n-Aprender e entender Spring\n-Criar minha primeira API sozinho";
	}
}
