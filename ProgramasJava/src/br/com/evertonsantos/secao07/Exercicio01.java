package br.com.evertonsantos.secao07;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int num, maior = 0;
		Scanner teclado =  new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		num = teclado.nextInt();
		
		while(num != 0) {
			if(num > maior) {
				maior = num;
			}
			System.out.println("Informe um número inteiro: ");
			num = teclado.nextInt();
		}
		System.out.println("O maior número inteiro informado é: " +maior);
		
		teclado.close();
	}
	
}
