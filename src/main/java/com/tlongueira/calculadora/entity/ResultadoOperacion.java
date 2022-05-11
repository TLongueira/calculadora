package com.tlongueira.calculadora.entity;

public class ResultadoOperacion {
private int resultado;
public ResultadoOperacion(int resultado) {
	super();
	this.resultado = resultado;
}
public ResultadoOperacion() {
	super();
}
public int getResultado() {
	return resultado;
}
public void setResultado(int resultado) {
	this.resultado = resultado;
}
@Override
public String toString() {
	return "ResultadoOperacion [resultado=" + resultado +  "]";
}

}
