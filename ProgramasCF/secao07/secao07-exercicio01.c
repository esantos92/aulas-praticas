#include <stdio.h>

int main(){
	int n, maior = 0;

	printf("Informe um n�mero: ");
	fflush(stdout);
	scanf("%d", &n);

	while(n != 0){
		if(n > maior){
			maior = n;
		}

		printf("Informe um n�mero: ");
		fflush(stdout);
		scanf("%d", &n);
	}
	printf("O maior n�mero � %d", maior);
}
