#include <stdio.h>

int main(){
	int vetor[10];
	char maiores_50 = 0;

	for(int i = 0; i < 10; i++){
		printf("Digite o valor de um n�mero para o vetor (%d/10): ", i + 1);
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	for(int i = 0; i <10; i++){
		if(vetor[i] > 50){
			printf("O valor da posi��o %d � maior que 50 e � %d\n", i, vetor[i]);
			maiores_50 = 1;

		}
	}
	if(maiores_50 < 1){
		printf("N�o existem valores maiores que 50!");
	}

}
