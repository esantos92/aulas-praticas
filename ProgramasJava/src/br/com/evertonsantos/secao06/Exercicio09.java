package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		float ind;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor do índice de poluíção: ");
		ind = teclado.nextFloat();
		
		if(ind >= 0.3 && ind < 0.4) {
			System.out.println("Grupo 1 suspender atividades!");
		}else if(ind >= 0.4 && ind < 0.5){
			System.out.println("Grupo 1 e Grupo 2 suspender atividades!");
		}else if(ind >= 0.5){
			System.out.println("Todos os Grupos suspender atividades!!!!!");
	}else {
		System.out.println("Nível do indice de poluição aceitavel!");
	}
		
		teclado.close();
	}
	
}