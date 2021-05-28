#include <stdio.h>

int main(){

	int num1, num2, num3, num4, soma;


	printf("Informe quatro números inteiros  diferentes 1/4. ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Informe quatro números inteiros  diferentes 2/4. ");
	fflush(stdout);
	scanf("%d", &num2);

	printf("Informe quatro números inteiros  diferentes 3/4. ");
	fflush(stdout);
	scanf("%d", &num3);

	printf("Informe quatro números inteiros  diferentes 4/4. ");
	fflush(stdout);
	scanf("%d", &num4);


	if((num1 > num2) && (num1 > num3) && (num1>num4)){
		soma = num2 + num3 + num4;
		printf("A soma dos três menores valores é: %d", soma);

	}else if((num2 > num1) && (num2 > num3) && (num2 > num4)){
		soma = num1 + num3 + num4;
		printf("A soma dos três menores valores é: %d", soma);

	}else if((num3 > num1) && (num3 > num2) && (num3 > num4)){
		soma = num1 + num2 + num4;
		printf("A soma dos três menores valores é: %d", soma);

	}else if((num4 > num1) && (num4 > num2) && (num4 > num3)){
		soma = num1 + num2 + num3;
		printf("A soma dos três menores valores é: %d", soma);
	}
	}
