#include <stdio.h>

int main(){
	int c;
	float n, e = 0, salario, valor_hora = 10.00;

	printf("Informe o c�digo: ");
	fflush(stdout);
	scanf("%d", &c);

	printf("Informe a quantidade de horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &n);

	if ( n> 50){
		e = (n - 50) * 20.00;
		salario = (50 * valor_hora) + e;
		printf( "Sal�rio total: R$ %.2f\n", salario);
		printf("Sal�rio excedente R$ %.2f", e);
	}else{
		salario = n * valor_hora;
		printf("Sal�rio Total R$ %.2f\n", salario);
		printf("Sal�rio Excedente R$ %.2f", e);
	}
}
