package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		int num, a, b;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		num= teclado.nextInt();
		
		if (num > 0){
			a = num;
			System.out.println("Valor a positivo = " + a);
		}else{
			b = num;
			System.out.println("Valor b negativo = " + b);
		}
		teclado.close();
	}

}
