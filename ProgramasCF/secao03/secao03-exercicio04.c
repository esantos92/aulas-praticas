#include <stdio.h>

int main(){
	int numero1, numero2, soma;

	printf("Informe o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d", &numero1);

	printf("Informe o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &numero2);

	soma = numero1 + numero2;

	printf("A soma dos n�meros �: %d", soma);

}
