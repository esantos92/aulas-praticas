package br.com.evertonsantos.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		float altura, peso_ideal;
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Informe a sua altura: ");
		altura = teclado.nextFloat();
		
		peso_ideal =(float)((altura * 72.7) - 58);
		
		System.out.printf("O seu peso ideal é: %.2f", peso_ideal);
		
		teclado.close();
	}

}
