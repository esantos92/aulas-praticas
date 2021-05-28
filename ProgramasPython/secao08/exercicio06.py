vetor=[]

cod=int(input("Digite o código: "))
if cod != 0:
    for i in range(0,5):
        num=float(input("Informe um valor: "))
        vetor.append(num)
    if cod == 1:
        for i in vetor:
            print(i)
    if cod == 2:
        vetor.reverse()
        for i in vetor:
            print(i)