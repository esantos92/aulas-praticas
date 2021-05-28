package br.com.evertonsantos.secao07;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		int num;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero menor que 10 e positivo para ver sua tabuada.");
		num = teclado.nextInt();
		
		while (num > 10 || num <= 0){
			System.out.println("O n�mero deve ser positivo e menor que 10!!!");
			System.out.println("Informe um n�mero menor que 10 e positivo para ver sua tabuada");
			num = teclado.nextInt();
		}
			System.out.printf("A tabuada de %d �: \n", num);
			for (int i = 0; i <= 10; i++) {
				System.out.printf("%dX%d=%d\n", num, i, (num * i));
			}
		teclado.close();	
	}
}


