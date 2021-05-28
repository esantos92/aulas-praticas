package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, sqr1, sqr2, sqr3, sqr4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro (1/4:) ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe um número inteiro (2/4): ");
		num2 = teclado.nextInt();
		
		System.out.println("Informe um número inteiro (3/4): ");
		num3 = teclado.nextInt();
		
		System.out.println("Informe um número inteiro (4/4): ");
		num4 = teclado.nextInt();
		
		sqr1= num1 * num1;
		sqr2= num2 * num2;
		sqr3= num3 * num3;
		sqr4= num4 * num4;
		
		if(sqr3 >= 1000) {
			System.out.println("num3^2= "+ sqr3);
		}else {
			System.out.printf("num1^2= %d; num2^2= %d; num3^2= %d; num4^2= %d", sqr1, sqr2, sqr3, sqr4);
			
		}
		teclado.close();
	}

}
