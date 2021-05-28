package br.com.evertonsantos.secao08;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado= new Scanner (System.in);
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Digite um valor: ");
			vetor[i]= teclado.nextInt();
			soma = soma + vetor[i];
			
		}
		System.out.println("Soma: " +soma);
		teclado.close();
	}

}
