#include <stdio.h>

int main(){
	int metros, centimetros;

	printf("Informe a medida em metros: ");
	fflush(stdout);
	scanf("%d", &metros);

	centimetros = (metros * 100);

	printf("medida em centimetros é: %d cm", centimetros);
}
