package br.com.evertonsantos.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);	
		
		System.out.println("Informe a Quantidade M�nima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a Quantidade M�xima: ");
		quantidade_maxima = teclado.nextInt();
		
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2;
		
		System.out.println("O estoque m�dio � " + estoque_medio);
		
		teclado.close();
	}

}
