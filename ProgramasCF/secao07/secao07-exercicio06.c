#include <stdio.h>

int main(){
	int n;

	printf("Informe um n�mero entre 1 e 10: ");
	fflush(stdout);
	scanf("%d", &n);

	while(n < 1 || n > 10){
		printf("O n�mero deve ser menor que 10!\n");
		printf("Informe um n�mero entre 1 e 10: ");
		fflush(stdout);
		scanf("%d", &n);
	}
	for(int i = 1; i <= 10; i++){
		printf("%d X %d = %d\n", n, i, (n * i));
	}

}
