package br.com.evertonsantos.secao07;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		int num, maior = -999, menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um n�mero inteiro positivo: ");
			num = teclado.nextInt();
			
			if(num > 0) {
			
				if (num > maior) {
				maior = num;
				}			
				if (num < menor) {
				menor = num;
				}
				soma = soma + num;
		
			}else {
				i--;
			}			
			
	}
	media = soma / 10;
	System.out.println("O maior n�mero �: " +maior);
	System.out.println("O menor n�mero �: " +menor);
	System.out.println("A m�dia dos n�meros �: " +media);
	teclado.close();	
		
	
	}
}	