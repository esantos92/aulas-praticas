#include <stdio.h>

int main(){
	int vetor[10];
	char maiores_50 = 0;

	for(int i = 0; i < 10; i++){
		printf("Digite o valor de um número para o vetor (%d/10): ", i + 1);
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	for(int i = 0; i <10; i++){
		if(vetor[i] > 50){
			printf("O valor da posição %d é maior que 50 e é %d\n", i, vetor[i]);
			maiores_50 = 1;

		}
	}
	if(maiores_50 < 1){
		printf("Não existem valores maiores que 50!");
	}

}
