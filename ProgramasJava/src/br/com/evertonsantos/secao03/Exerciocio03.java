package br.com.evertonsantos.secao03;

import java.util.Scanner;

public class Exerciocio03 {
		public static void main(String[] args) {
			
			int num1, num2, soma;
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Informe o primeiro n�mero: ");
			num1 = teclado.nextInt();
			
			System.out.println("Informe o segundo n�mero: ");
			num2 = teclado.nextInt();
			
			soma =(num1 + num2);
			
			System.out.println("A soma �: " + soma);
			
			teclado.close();
			
		}

}
