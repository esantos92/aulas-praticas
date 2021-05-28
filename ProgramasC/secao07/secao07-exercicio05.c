#include <stdio.h>
#include <string.h>

int main(){
	char nome[100], senha[100];


	printf("Informe o Nome: ");
	fflush(stdout);
	gets(nome);
	printf("Informe a Senha: ");
	fflush(stdout);
	gets(senha);

	while(!strcmp(nome, senha)){
		printf("Nome e Senha devem ser diferentes!!!\n");
		printf("Informe o Nome: ");
		fflush(stdout);
		gets(nome);
		printf("Informe a Senha: ");
		fflush(stdout);
		gets(senha);
	}
}
