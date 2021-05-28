cod = int(input("Informe a identificação do mouse: "))
qtd = 0
nec_01 = 0
nec_02 = 0
nec_03 = 0
nec_04 = 0

while cod != 0:
    print("Indentifique o defeito: ")
    print("1- necessita de esfera;")
    print("2- necessita de limpeza;")
    print("3- necessita troca do cabo ou conector;")
    print("4- quebrado ou inutilizado.")
    
    defeito = int(input("Informe o código do defeito: "))
    
    while defeito != 1 and defeito != 2 and defeito != 3 and defeito != 4:
        print("Informe um defeito válido!")
        defeito = int(input("Informe o código do defeito: "))
        
    if defeito == 1:
        nec_01 = nec_01 + 1
    
    elif defeito == 2:
        nec_02 = nec_02 + 1
        
    elif defeito == 3:
        nec_03 = nec_03 + 1
    
    elif defeito == 4:
        nec_04 = nec_04 + 1
        
    qtd = qtd + 1
        
    cod = int(input("Informe a identificação do mouse (zero para finalizar): "))
    
p1 = float(nec_01/qtd) * 100
p2 = float(nec_02/qtd) * 100
p3 = float(nec_03/qtd) * 100
p4 = float(nec_04/qtd) * 100
    
    
print("total de mouses: {0}".format(qtd)) 
print("Situação\t\t\t\t\tQuantidade\t\tPercentual")
print("1- necessita de esfera\t\t\t\t\t{0}\t\t{1:.2f}%".format(nec_01,p1))
print("2- necessita de limpeza\t\t\t\t\t{0}\t\t{1:.2f}%".format(nec_02,p2))
print("3- necessita troca do cabo ou conector\t\t\t{0}\t\t{1:.2f}%".format(nec_03,p3))
print("3- necessita troca do cabo ou conector\t\t\t{0}\t\t{1:.2f}%".format(nec_04,p4))