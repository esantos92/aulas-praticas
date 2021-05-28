package br.com.evertonsantos.secao07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		int id, qtd = 0, nec_esfera_1 = 0, nec_limpeza_2 = 0, nec_troca_cabo_3 = 0, quebrado_4 = 0, defeito;
		float perc_1, perc_2, perc_3, perc_4;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o id do mouse.");
		id = teclado.nextInt();
		
		while (id != 0) {
			qtd= qtd +1;
			
			System.out.println("Identifique o defeito e informe conforme o codigo:");
			System.out.println("1- Necessita da troca da esfera;");
			System.out.println("2- Necessita de limpeza;");
			System.out.println("3- Necessita trocar cabo ou conector;");
			System.out.println("4- Quebrado ou inutilizado.");
			
			defeito = teclado.nextInt();
			
			System.out.println("Informe o id do mouse (0 para finalizar).");
			id = teclado.nextInt();
			
			if (defeito != 1 && defeito != 2 && defeito != 3 && defeito != 4 && defeito != 0) {
				System.out.println("informe um código de defeito válido como especificado!");
				System.out.println("1- Necessita da troca da esfera;");
				System.out.println("2- Necessita de limpeza;");
				System.out.println("3- Necessita trocar cabo ou conector;");
				System.out.println("4- Quebrado ou inutilizado.");
				
				defeito = teclado.nextInt();
			}
			
			if (defeito == 1) {
				nec_esfera_1 = nec_esfera_1 + 1;
			}
			if (defeito == 2) {
				nec_limpeza_2 = nec_limpeza_2 + 1;
			}
			if (defeito == 3) {
				nec_troca_cabo_3 = nec_troca_cabo_3 + 1;
			}
			if (defeito == 4) {
				quebrado_4 = quebrado_4 + 1;
			}
		}
		perc_1 = (nec_esfera_1 * 100) / qtd;
		perc_2 = (nec_limpeza_2 * 100) / qtd;
		perc_3 = (nec_troca_cabo_3 * 100) / qtd;
		perc_4 = (quebrado_4 * 100) / qtd;
		
		System.out.println("defeito\t\t\t\t\t\tquantidade\t\tpercentual");
		System.out.printf("1- Necessita da troca da esfera\t\t\t%d\t\t\t%.2f%%\n", nec_esfera_1, perc_1);
		System.out.printf("2- Necessita de limpeza\t\t\t\t%d\t\t\t%.2f%%\n", nec_limpeza_2, perc_2);
		System.out.printf("3- Necessita trocar cabo ou conector\t\t%d\t\t\t%.2f%%\n", nec_troca_cabo_3, perc_3);
		System.out.printf("4- Quebrado ou inutilizado\t\t\t%d\t\t\t%.2f%%", quebrado_4, perc_4);
		
		teclado.close();
	}

}
