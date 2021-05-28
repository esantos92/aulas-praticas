#include <stdio.h>

int main(){
	int n, a, b;

	printf("digite o número: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n > 0){
		a = n;
		printf("n= %d é positivo", n);
	}else{
		b = n;
		printf("n= %d é negativo", n);
	}

}
