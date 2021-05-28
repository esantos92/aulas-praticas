package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int cod, horas_trab, horas_exc = 0;
		float sal_exc, sal_tot, valor_hora = (float)10.00;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		cod = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		horas_trab= teclado.nextInt();
		
		if(horas_trab > 50) {
			horas_exc = horas_trab - 50;
			sal_exc = horas_exc * 20;
			sal_tot = (50 * valor_hora) + sal_exc;
			System.out.printf("Salário excedente = R$%.2f; Salário total = R$%.2f.", sal_exc, sal_tot);
		}else {
			sal_exc = 0;
			sal_tot = valor_hora * horas_trab;
			System.out.printf("Salário total = R$%.2f; Salário excedente = R$%.2f.", sal_tot, sal_exc);
		}
		teclado.close();
		

	}

}
