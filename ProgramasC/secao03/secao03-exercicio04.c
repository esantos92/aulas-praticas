#include <stdio.h>

int main(){
	int numero1, numero2, soma;

	printf("Informe o primeiro número: ");
	fflush(stdout);
	scanf("%d", &numero1);

	printf("Informe o segundo número: ");
	fflush(stdout);
	scanf("%d", &numero2);

	soma = numero1 + numero2;

	printf("A soma dos números é: %d", soma);

}
