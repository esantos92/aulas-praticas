peso= float(input("Informe o peso total de peixes pescados: "))

if peso > 50:
    e = peso - 50
    m = e * 4
    print("Peso total: {0:.2f}Kg".format(peso))
    print("Peso excendente: {0:.2f}Kg".format(e))
    print("Multa a ser paga: R${0:.2f}".format(m))
    
else:
    print("Você não excedeu o limite de peso, nao tendo que pagar multas.")    