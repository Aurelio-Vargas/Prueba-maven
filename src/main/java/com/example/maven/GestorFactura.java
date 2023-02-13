package com.example.maven;

public class GestorFactura {
	
	//1.atributos
	Calculadora calculadora;
	String nombre;

	//2. contructores
	public GestorFactura(Calculadora calculadora, String nombre) {
		System.out.println("Ejecutando contructor GestorFactura");
		this.calculadora = calculadora;
		this.nombre=nombre;
		
	}
	
	//3. metodos
	
}
