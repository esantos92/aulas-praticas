package br.com.evertonsantos.secao03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int metro, cent;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o valor em metros: ");
		metro = teclado.nextInt();
		
		cent = (metro *100);
		
		System.out.println(metro + " metros em centimetros é " + cent);
		
		teclado.close();

	}

}
