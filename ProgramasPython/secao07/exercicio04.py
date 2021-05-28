maior = -999
menor = 999
soma = 0

for n in range(1,11):
    num = int(input("Informe um número: "))
    
    while num < 0:
        num = int(input("Informe um número: "))
    
    if num > maior:
        maior = num
    if num < menor:
        menor = num
    soma = soma + num
    
media = soma / 10

print("O maior número é: {0}".format(maior))
print("O menor número é: {0}".format(menor))
print("A média dos números é: {0}".format(media))