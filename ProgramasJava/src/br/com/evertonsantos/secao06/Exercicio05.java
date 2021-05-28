package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		float peso, exc, multa;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o peso pescado: ");
		peso = teclado.nextFloat();
		
		if(peso > 50) {
			exc = peso - 50;
			multa = exc * 4;
			System.out.printf("O peso excedente pescado é de %.2fKg, devendo pagar uma multa no total de R$%.2f", exc, multa);
		}else {
			exc = 0;
			multa = 0;
			System.out.println("Você não excedeu do peso limite; Multas= R$" + multa);
		}
		
		teclado.close();
	}
	}
