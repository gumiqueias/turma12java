package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class controller {

	@GetMapping ("/get1")
	public String atv () {
		return "Habilidades e mentalidades utilizadas: Persistência, atenção aos detalhes e proatividade";
	}
	
	
}
