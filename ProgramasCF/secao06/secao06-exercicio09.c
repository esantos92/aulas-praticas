#include <stdio.h>

int main(){
	float ind_poluicao;

	printf("Insira o índice de poluição: ");
	fflush(stdout);
	scanf("%f", &ind_poluicao);

	if (ind_poluicao >= 0.30 && ind_poluicao < 0.40){
		printf("Grupo 01 suspender atividades!!!");
	}else if (ind_poluicao >= 0.40 && ind_poluicao < 0.50){
		printf("Grupos 01 e 02 suspender atividades!!!");
	}else if (ind_poluicao >= 0.50){
		printf("Suspender atividades de todos os grupos!!!");

	}else{
		printf("Niveis aceitáveis!!!");
	}


}
