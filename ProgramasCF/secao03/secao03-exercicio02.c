#include <stdio.h>

int main(){
	int quantidade_minima, quantidade_maxima;
	float estoque_medio;

	printf("Informe a quantidade m�nima: ");
	fflush(stdout);
	scanf("%d", &quantidade_minima);

	printf("Informe a quantidade m�xima: ");
	fflush(stdout);
	scanf("%d", &quantidade_maxima);

	estoque_medio= (quantidade_minima + quantidade_maxima) / 2;

	printf("O estoque m�dio �: %.2f", estoque_medio);
}
