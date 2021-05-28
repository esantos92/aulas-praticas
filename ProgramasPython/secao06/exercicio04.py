alt = float(input("Informe a sua altura: "))
sexo= (input("Informe o sexo (f/m):"))

if sexo.lower() == 'm':
    peso_ideal= (72.7 * alt) - 58
elif sexo.lower() == 'f':
    peso_ideal= (32.1 * alt) - 44.7
else:
    peso_ideal= 0
    print("Sexo não reconhecido.")    
    
print("Seu peso ideal é: {0:.2f}".format(peso_ideal))        