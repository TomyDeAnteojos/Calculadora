package org.curso.calculadora;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void ejercicio1()
	{
		// El resultado de multiplicar 80 por 3 da 240
		assertEquals(240, Calculadora.multiplicacion(80, 3));
	}
	
	@Test
	public void ejercicio2()
	{
		// El resultado de sumar 150 y 180, dividido por 3, da 110
		assertEquals(110, Calculadora.division(Calculadora.suma(150, 180), 3));
	}
	
	@Test
	public void ejercicio3()
	{
		// El resultado de restar 90 y 50, multiplicado por 15, no da 605.
		assertNotEquals(605, Calculadora.multiplicacion(Calculadora.resta(90, 50),15));
	}
	
	@Test
	public void ejercicio4()
	{
		// El resultado de sumar 70 y 40, multiplicado por 25, no da 2700.
		assertNotEquals(2700,Calculadora.multiplicacion(Calculadora.suma(70,40), 25));
	}
}