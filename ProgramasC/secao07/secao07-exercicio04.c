#include <stdio.h>

int main(){
	int valor, maior = -999, menor = 999, soma = 0;
	float media;

	for(int i = 0; i < 10; i++){
		printf("informe um valor: ");
		fflush(stdout);
		scanf("%d", &valor);

		if(valor > 0){
			if(valor > maior){
				maior = valor;
			}
			if(valor < menor){
				menor = valor;
			}
			soma = soma + valor;
		}else{
			i--;
		}
	}
	media = soma / 10;
	printf("O maior n�mero � %d\n", maior);
	printf("O menor n�mero � %d\n", menor);
	printf ("A m�dia dos n�meros � %2.f", media);
}
