#include <stdio.h>

int main(){
	int n1, n2, n3, n4, q1, q2, q3, q4;

	printf("Digite o primeiro número: ");
	fflush(stdout);
	scanf("%d", &n1);

	printf("Digite o segundo número: ");
	fflush(stdout);
	scanf("%d", &n2);

	printf("Digite o terceiro número: ");
	fflush(stdout);
	scanf("%d", &n3);

	printf("Digite o quarto número: ");
	fflush(stdout);
	scanf("%d", &n4);

	q1 = n1 * n1;
	q2 = n2 * n2;
	q3 = n3 * n3;
	q4 = n4 * n4;

	if (q3 >= 1000){
		printf(" N3^2=%d", q3);
	}else{
		printf("N1= %d; N1^2=%d\n", n1, q1);
		printf("N2= %d; N2^2=%d\n", n2, q2);
		printf("N3= %d; N3^2=%d\n", n3, q3);
		printf("N4= %d; N4^2=%d", n4, q4);
	}

}
