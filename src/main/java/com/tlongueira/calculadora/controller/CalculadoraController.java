package com.tlongueira.calculadora.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculadora")
public class CalculadoraController {
	@GetMapping
	public ResponseEntity<String>  estoyVivo(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<String>  sumar(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<String>  restar(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<String>  multiplicar(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}
	@GetMapping
	public ResponseEntity<String>  dividir(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}

}
