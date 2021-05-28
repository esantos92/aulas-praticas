#include <stdio.h>

int main(){
	float p, e = 0, m = 0;

	printf("Digite o peso pescado: ");
	fflush(stdout);
	scanf("%f", &p);

	if (p > 50.00){
		e = p - 50;
		m = e * 4;
	}

	printf("%.2fKg pescados.\n", p);
	printf("%.0fKg excedentes.\n", e);
	printf("R$%.2f de multa a ser pago.", m);
}
