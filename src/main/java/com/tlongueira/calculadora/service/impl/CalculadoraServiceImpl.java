package com.tlongueira.calculadora.service.impl;

import org.springframework.stereotype.Service;

import com.tlongueira.calculadora.dto.ValoresDTO;
import com.tlongueira.calculadora.entity.ResultadoOperacion;
import com.tlongueira.calculadora.service.CalculadoraService;

@Service
public class CalculadoraServiceImpl implements CalculadoraService{

	@Override
	public ResultadoOperacion sumar(ValoresDTO valoresDTO) {
		ResultadoOperacion resultado= new ResultadoOperacion();
		resultado.setResultado(valoresDTO.getValor1()+valoresDTO.getValor2());
		return resultado;
	}

	@Override
	public ResultadoOperacion restar(ValoresDTO valoresDTO) {
		ResultadoOperacion resultado= new ResultadoOperacion();
		resultado.setResultado(valoresDTO.getValor1()-valoresDTO.getValor2());
		return resultado;
	}

	@Override
	public ResultadoOperacion mutiplicar(ValoresDTO valoresDTO) {
		ResultadoOperacion resultado= new ResultadoOperacion();
		resultado.setResultado(valoresDTO.getValor1()*valoresDTO.getValor2());
		return resultado;
	}

	@Override
	public ResultadoOperacion dividir(ValoresDTO valoresDTO) {
		ResultadoOperacion resultado= new ResultadoOperacion();
		resultado.setResultado(valoresDTO.getValor1()/valoresDTO.getValor2());
		return resultado;
	}

}
