package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro(1/2)");
		num1 = teclado.nextInt();
		
		System.out.println("Informe um n�mero inteiro(2/2)");
		num2 = teclado.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("N�mero 01 � par!\n");
		}else {
			System.out.println("N�mero 01 � impar!\n");
		}
		
		if(num2 % 2 == 0) {
			System.out.println("N�mero 02 � par!\n");
		}else {
			System.out.println("N�mero 02 � impar!\n");
		}
		
		if(num1 > 0) {
			System.out.println("N�mero 01 � positivo!\n");
		}else {
			System.out.println("N�mero 01 � negativo!\n");
		}
		
		if(num2 > 0) {
			System.out.println("N�mero 02 � positivo!\n");
		}else {
			System.out.println("N�mero 02 � negativo!\n");
		}
		teclado.close();
		}
		


	}


