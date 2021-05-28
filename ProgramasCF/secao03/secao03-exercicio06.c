#include <stdio.h>

int main(){
	float salario_hora, total;
    int horas;

	printf("quanto você ganha por hora?: ");
	fflush(stdout);
	scanf("%f", &salario_hora);

	printf("quantas horas você trabalhou?: ");
	fflush(stdout);
	scanf("%d", &horas);

	total = (salario_hora * horas);

	printf("seu salário total é: R$%.2f", total);
}
