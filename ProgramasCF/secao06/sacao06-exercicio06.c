#include <stdio.h>

int main(){
	int c;
	float n, e = 0, salario, valor_hora = 10.00;

	printf("Informe o código: ");
	fflush(stdout);
	scanf("%d", &c);

	printf("Informe a quantidade de horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &n);

	if ( n> 50){
		e = (n - 50) * 20.00;
		salario = (50 * valor_hora) + e;
		printf( "Salário total: R$ %.2f\n", salario);
		printf("Salário excedente R$ %.2f", e);
	}else{
		salario = n * valor_hora;
		printf("Salário Total R$ %.2f\n", salario);
		printf("Salário Excedente R$ %.2f", e);
	}
}
