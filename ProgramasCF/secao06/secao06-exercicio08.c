#include <stdio.h>

int main(){
	int n;

	printf("Digite um n�mero: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n % 2 == 0){
	printf("este n�mero � par!!!\n");

    }else{
	printf("Este n�mero � impar!!!\n");

    }

	if (n > 0){
	printf("Este n�mero � positivo!!!");

	}else{
	printf("Este n�mero � negativo!!!");
	}
}
