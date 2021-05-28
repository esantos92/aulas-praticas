package br.com.evertonsantos.secao07;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		String nome, senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o Nome de Usuário: ");
		nome = teclado.next();
		
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		
		while ( nome.equals(senha)) {
			System.out.println("Erro: o Nome de Usuário e senha devem ser diferentes");
			
			System.out.println("Informe o Nome de Usuário: ");
			nome = teclado.next();
			
			System.out.println("Informe a senha: ");
			senha = teclado.next();	
		}
		teclado.close();
	}

}
