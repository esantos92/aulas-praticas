num = int(input("Informe um número inteiro: "))

if num % 2 == 0:
    if num > 0:
        print("O número {0} é par e positivo.".format(num))
    else:
        print("O número {0} é par e negativo.".format(num))
else:
    if num > 0:
        print("O número {0} é impar e positivo.".format(num))
    else:
        print("O número {0} é impar e negativo.".format(num))