

def nombre_divisible(liste, n):
    #i = 2 # plus petit diviseur possible de n
    cpt = 0 # initialise le compteur de diviseurs
    for i in liste:
        if n != 0:
         if i%n == 0:
            cpt += 1
    return cpt


n = int(input("SVP, Entrez un entier : "))
ch = input("Veuillez entrer une liste d'entiers séparées par des virgules: ")
l1 = list(eval(ch))
print ("Le nombre d'élements disibles par", n ,"dans la liste est :", nombre_divisible(l1, n))


