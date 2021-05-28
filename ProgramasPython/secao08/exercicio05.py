vetor=[]
maiores_50 = False

for i in range(1,11):
    num = int(input("Informe um valor {0}/10:".format(i)))
    vetor.append(num)

for n in vetor:    
    if n > 50:
        print("Número {0} maior do que 50 na posição {1}".format(n,vetor.index(n)))
        maiores_50 = True

if maiores_50 == False:
    print("Não existem valores maiores que 50.")