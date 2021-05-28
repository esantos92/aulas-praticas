#include <stdio.h>

int main(){
	int vetor[20], soma = 0;

	for(int i = 0; i < 20; i++){
		printf("Informe um valor para o vetor (%d/20):", i+1);
		fflush(stdout);
		scanf("%d", &vetor[i]);
		soma = soma + vetor[i];
	}
	printf("O valor da soma dos vetores é: %d", soma);
}
