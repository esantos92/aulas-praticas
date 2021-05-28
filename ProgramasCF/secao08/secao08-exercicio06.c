#include <stdio.h>

int main(){
	float valor[5];
	int codigo;

	printf("Digite o código:\n1-imprimir vetor na ordem direta;\n2-imprimir vetor na ordem inversa;\n0-finalizar programa.");
	fflush(stdout);
	scanf("%d", &codigo);

	if(codigo != 0){
		for(int i = 0; i < 5; i++){
		printf("Digite um valor real: ");
		fflush(stdout);
		scanf("%f", &valor[i]);
		}

	if(codigo == 1){
		for(int i = 0; i < 5; i++){
		printf("%.2f\n", valor[i]);
		}
	}
	if(codigo == 2){
		for(int i = 4; i >= 0; i--){
			printf("%.2f\n", valor[i]);
	}
	}
	}
}
