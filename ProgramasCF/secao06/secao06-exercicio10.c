#include <stdio.h>

int main(){
	int idade;

	printf("Qual a sua idade?: ");
	fflush(stdout);
	scanf("%d", &idade);

	if (idade >= 5 && idade <= 7){
		printf("Sua categoria � a Infantil A.");
	}else if (idade >= 8 && idade <= 11){
		printf("Sua categoria � a Infantil B.");
	}else if (idade >= 12 && idade <= 13){
		printf("Sua categoria � a Juvenil A.");
	}else if (idade >= 14 && idade <= 17){
		printf("Sua categoria � a Juvenil B.");
	}else if (idade >= 18){
		printf("Sua Categoria � a Adulto.");
	}else{
		printf("Voc� n�o tem idade suficiente para competir.");
	}
}
