package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		float alt, peso_ideal;
		char sexo;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		alt = teclado.nextFloat();
		
		System.out.println("Informe o sexo m/f: ");
		sexo = teclado.next().charAt(0);
		
		if(sexo =='m') {
			peso_ideal = (float)((alt * 72.7) - 58);
			System.out.printf("Seu peso ideal é %.2f", peso_ideal);
		}
		if(sexo =='f') {
			peso_ideal = (float)((alt * 62.1) - 44.7);
			System.out.printf("Seu peso ideal é %.2f", peso_ideal);
		}
		if((sexo != 'f') && (sexo != 'm')) {
			System.out.println("Informe o sexo corretamente(m/f)...\n");
			peso_ideal = 0;
		}
		teclado.close();
	}
	}
