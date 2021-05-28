package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = teclado.nextInt();
		
		if(num > 100 ){
			System.out.println(num);
		}else{
			num = 0;
			System.out.println(num);
		}
		teclado.close();
	}

}
