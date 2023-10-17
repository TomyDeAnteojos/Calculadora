package org.curso.calculadora;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        while(true)
        {
        	System.out.print("\033[H\033[2J"); //BORRA LA PANTALLA
        	
        	System.out.print(""
        			+ "MENU\n"
        			+ "-------------\n"
        			+ "1. Suma\n"
        			+ "2. Resta\n"
        			+ "3. Multiplicacion\n"
        			+ "4. Division\n"
        			+ "Ingrese su opcion: ");
        	int op = sc.nextInt();
        	int n1=1,n2=2;
        	switch (op)
        	{
        	case 1:
        		
        		System.out.println(Calculadora.suma(n1,n2));
        		break;
        	case 2:
        		System.out.println(Calculadora.resta(n1,n2));
        		break;
        	case 3:
        		System.out.println(Calculadora.multiplicacion(n1,n2));
        		break;
        	case 4:
        		System.out.println(Calculadora.division(n1,n2));
        		break;
        	}
        }
    }
}
