#include<stdio.h>

int main(){
	int x;

	printf("Digite um n�mero inteiro: ");
	fflush(stdout);
	scanf("%d", &x);

	if((x % 5 ==0) && (x % 3==0)){
		printf("N�mero multiplo comum!");
	}else{
		printf("N�mero n�o multiplo comum!");
	}
}
