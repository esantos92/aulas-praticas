horas = int(input("Informe a quantidade de horas trabalhadas: "))
valor_hora = float(input("Informe o valor pago por hora trabalhada: "))

total= horas*valor_hora

print("O total a ser recebido é R${0:.2f}.".format(total))