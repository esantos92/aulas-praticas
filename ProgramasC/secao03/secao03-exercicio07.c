#include <stdio.h>

int main(){
	int peso_a_perder;
	float peso, altura, peso_ideal;

	printf("qual a sua altura?: ");
	fflush(stdout);
	scanf("%f", &altura);

	peso_a_perder = 58;
	peso = 72.7;
	peso_ideal = (peso * altura) - peso_a_perder;

	printf("Seu peso ideal é: %.2f", peso_ideal);

}
