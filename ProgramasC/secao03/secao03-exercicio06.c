#include <stdio.h>

int main(){
	float salario_hora, total;
    int horas;

	printf("quanto voc� ganha por hora?: ");
	fflush(stdout);
	scanf("%f", &salario_hora);

	printf("quantas horas voc� trabalhou?: ");
	fflush(stdout);
	scanf("%d", &horas);

	total = (salario_hora * horas);

	printf("seu sal�rio total �: R$%.2f", total);
}
