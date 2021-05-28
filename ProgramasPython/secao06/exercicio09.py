p = float(input("Informe o índice de poluição: "))

if (p >= 0.3 and p < 0.4):
    print("Grupo 1 suspender atividades!")
elif (p >= 0.4 and p < 0.5):
    print("Grupo 1 e Grupo 2 suspender atividades!")
elif (p >= 0.5):
    print("Todos os Grupos suspender atividades!!!!")
else:
    print("Nivel aceitável de poluição.")    