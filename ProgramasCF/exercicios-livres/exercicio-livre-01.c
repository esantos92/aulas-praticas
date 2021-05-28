#include<stdio.h>

int main(){
	int x;

	printf("Digite um número inteiro: ");
	fflush(stdout);
	scanf("%d", &x);

	if((x % 5 ==0) && (x % 3==0)){
		printf("Número multiplo comum!");
	}else{
		printf("Número não multiplo comum!");
	}
}
