#include <stdio.h>

int main(){
	int x, y;


	printf("Digite um valor inteiro para x: ");
	fflush(stdout);
	scanf("%d", &x);


	if(x < 1){
	y = x;
	printf("O valor de y é: %d", y);

	}else if(x == 1){
	y = 0;
	printf("O valor de y é: %d", y);

	}else if(x > 1){
	y = x * x;
	printf("O valor de y é: %d", y);
	}
	}
