package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro(1/2)");
		num1 = teclado.nextInt();
		
		System.out.println("Informe um número inteiro(2/2)");
		num2 = teclado.nextInt();
		
		if(num1 % 2 == 0) {
			System.out.println("Número 01 é par!\n");
		}else {
			System.out.println("Número 01 é impar!\n");
		}
		
		if(num2 % 2 == 0) {
			System.out.println("Número 02 é par!\n");
		}else {
			System.out.println("Número 02 é impar!\n");
		}
		
		if(num1 > 0) {
			System.out.println("Número 01 é positivo!\n");
		}else {
			System.out.println("Número 01 é negativo!\n");
		}
		
		if(num2 > 0) {
			System.out.println("Número 02 é positivo!\n");
		}else {
			System.out.println("Número 02 é negativo!\n");
		}
		teclado.close();
		}
		


	}


