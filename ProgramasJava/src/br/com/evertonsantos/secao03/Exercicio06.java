package br.com.evertonsantos.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor_hora, total;
		int horas_trab; 
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horas_trab = teclado.nextInt();
		
		System.out.println("Informe o valor a ser pago por hora trabalhada: ");
		valor_hora = teclado.nextFloat();
		
		total =(float) ((valor_hora * horas_trab));
		
		System.out.println("Você receberá um total de:R$ " + total);
		
		teclado.close();
	}

}
