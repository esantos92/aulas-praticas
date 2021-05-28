#include <stdio.h>

int main(){
	int vetor_1[10], vetor_2[10], soma_vetor[10];

	for(int i = 0; i < 10; i++){
	printf("Informe um valor para o primeiro vetor: ");
	fflush(stdout);
	scanf("%d", &vetor_1[i]);

	printf("Informe um valor para o segundo vetor: ");
	fflush(stdout);
	scanf("%d", &vetor_2[i]);

	soma_vetor[i] = vetor_1[i] + vetor_2[i];
	}

	for(int i = 0; i < 10; i++){
		printf("A soma dos dois vetores na mesma posição é: %d\n", soma_vetor[i]);
	}

}
