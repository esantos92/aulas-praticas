#include <stdio.h>

int main(){
	int n, a, b;

	printf("digite o n�mero: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n > 0){
		a = n;
		printf("n= %d � positivo", n);
	}else{
		b = n;
		printf("n= %d � negativo", n);
	}

}
