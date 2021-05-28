num = int(input("Informe um número inteiro menor que 10: "))

while num > 10:
    print("Informe um número menor que 10!!!")
    num = int(input("Informe um número inteiro menor que 10: "))

print("A tabuada de {0} é: ".format(num))

for i in range(1,11):
    print("{0} X {1} = {2}".format(num, i, (i * num)))
    