package com.tlongueira.calculadora.service;

import com.tlongueira.calculadora.dto.ValoresDTO;
import com.tlongueira.calculadora.entity.ResultadoOperacion;

public interface CalculadoraService {
	public ResultadoOperacion sumar(ValoresDTO valoresDTO);
	public ResultadoOperacion restar(ValoresDTO valoresDTO);
	public ResultadoOperacion mutiplicar(ValoresDTO valoresDTO);
	public ResultadoOperacion dividir(ValoresDTO valoresDTO);
}
