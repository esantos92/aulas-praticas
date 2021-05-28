c= int(input("Informe o código: "))
horas= int(input("Informe a quantidade de horas trabalhadas: "))
e= 0

if horas > 50:
    e = horas - 50
    extra = e * 20
    print("Salário total = R${0:.2f}".format(500 + extra))
    print("Salário extra = R$ {0:.2f}".format(extra))
else:
    print("Salário total = R${0:.2f}".format(horas * 10))
    print("Salário extra = R${0:.2f}".format(e))