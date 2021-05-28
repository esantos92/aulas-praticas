vetor=[]
soma=0

for i in range(1,21):
    num=int(input("Informe um número {0}/20: ".format(i)))
    vetor.append(num)
    soma = soma + num
    
print(soma)