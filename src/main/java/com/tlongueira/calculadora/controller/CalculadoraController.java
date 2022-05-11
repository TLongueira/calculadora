package com.tlongueira.calculadora.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tlongueira.calculadora.dto.ValoresDTO;
import com.tlongueira.calculadora.entity.ResultadoOperacion;
import com.tlongueira.calculadora.service.CalculadoraService;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@Autowired
	CalculadoraService calculadoraService;
	@GetMapping
	public ResponseEntity<String>  estoyVivo(){
		return new ResponseEntity<String>("Vivo", HttpStatus.OK);
	}
	@PostMapping("/sumar")
	public ResponseEntity<ResultadoOperacion>  sumar(@Valid @RequestBody ValoresDTO valoresDTO){
		return new ResponseEntity<ResultadoOperacion>(calculadoraService.sumar(valoresDTO), HttpStatus.OK);
	}
	@PostMapping("/restar")
	public ResponseEntity<ResultadoOperacion>  restar(@Valid @RequestBody ValoresDTO valoresDTO){
		return new ResponseEntity<ResultadoOperacion>(calculadoraService.restar(valoresDTO), HttpStatus.OK);
	}
	@PostMapping("/multiplicar")
	public ResponseEntity<ResultadoOperacion>  multiplicar(@Valid @RequestBody ValoresDTO valoresDTO){
		return new ResponseEntity<ResultadoOperacion>(calculadoraService.mutiplicar(valoresDTO), HttpStatus.OK);
	}
	@PostMapping("/dividir")
	public ResponseEntity<ResultadoOperacion>  dividir(@Valid @RequestBody ValoresDTO valoresDTO){
		return new ResponseEntity<ResultadoOperacion>(calculadoraService.dividir(valoresDTO), HttpStatus.OK);
	}

}
