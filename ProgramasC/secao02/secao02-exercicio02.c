#include <stdio.h>

int main(){
	int num1, num2, soma, multiplicacao;

	printf("Informe o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d",&num1);

	printf("Informe o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &num2);

	soma = num1 + num2;
	multiplicacao = soma * num1;

	printf("O resultado da multiplica��o � %d", multiplicacao);

}
