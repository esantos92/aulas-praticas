package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int num;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num= teclado.nextInt();
		
		if(num % 2 ==0){
			System.out.println("Este número é par!");
		}else{
			System.out.println("Este número é impar!");
		}
		teclado.close();
	}

}
