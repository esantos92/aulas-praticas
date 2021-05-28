num = int(input("Infome um número:"))
maior = 0

while num != 0:
    if num > maior:
        maior = num
    num = int(input("Infome um número:"))
print("O maior número é : {0}".format(maior))