#include <stdio.h>

int main(){
	int n;

	printf("informe um n�mero: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n > 100){
		printf("%d", n);
	}else{
		n = 0;
		printf("%d", n);
	}
}
