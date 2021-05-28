#include <stdio.h>

int main(){
	int n;

	printf("Digite um número: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n % 2 == 0){
	printf("este número é par!!!\n");

    }else{
	printf("Este número é impar!!!\n");

    }

	if (n > 0){
	printf("Este número é positivo!!!");

	}else{
	printf("Este número é negativo!!!");
	}
}
