package br.com.evertonsantos.secao06;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a idade do atleta: ");
		idade = teclado.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("A categoria do atleta � Infantil A.");
		}else if(idade >= 8 && idade <= 11 ){
			System.out.println("A categoria do atleta � Infantil B.");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("A categoria de atleta � Juvenil A.");
		}else if(idade >= 14 && idade <=17) {
			System.out.println("A categoria do atleta � Juvenil B.");
		}else if(idade >= 18) {
			System.out.println("A categoria do atleta � Adulto");
		}else {
			System.out.println("O atleta n�o tem idade suficiente para competir!");
		}
		teclado.close();

	}

}
