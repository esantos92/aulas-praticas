#include <stdio.h>

int main(){
	float altura, peso_ideal;
	char sexo;

	printf("Qual a sua altura?: ");
	fflush(stdout);
	scanf("%f", &altura);
    gets(stdin);
	printf("Qual o seu sexo (m/f)?: ");
	fflush(stdout);
	scanf("%c", &sexo);

	if (sexo == 'm' || sexo == 'M'){
		peso_ideal = (72.7 * altura) - 58;
		printf("seu peso ideal é: %.2f", peso_ideal);
	}

    if (sexo == 'f' || sexo == 'F'){
    	peso_ideal = (62.1 * altura) - 44.7;
    	printf("Seu peso ideal é: %.2f", peso_ideal);
    }
    if (sexo != 'f' && sexo != 'F' && sexo != 'm' && sexo != 'M'){
    	printf("Sexo não reconhecido. \n");
    }
}
