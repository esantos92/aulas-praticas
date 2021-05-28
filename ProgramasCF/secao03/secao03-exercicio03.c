#include <stdio.h>

int main(){
	int n, p = 0, i = 0;

	printf("digite um número: ");
	fflush(stdout);
	scanf("%d", &n);

	if (n % 2 == 0){
		p = n;
	}else{
		i = n;
	}
	printf("%d\n", p);
	printf("%d", i);
}
