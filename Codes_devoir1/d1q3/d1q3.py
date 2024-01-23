#fonction qui prend une liste de nombres et qui retourne True s’il y a au moins
#une séquence de deux éléments consécutifs égaux,
#et False dans le cas contraire. 

def sequenceDeDeux(x):
     '''(list)-> bool
      Retourne true s’il y a au moins une séquence de deux
      éléments consécutive égaux, et False sinon
      '''
     res = False
     i = 0
     while i < len(x) - 1 and not res:
       if x[i]== x[i+1]:
            res = True
       i = i + 1
     return res

s = input("Veuillez entrer une liste de valeurs séparées par des virgules: ")
a = list(eval(s))
print(sequenceDeDeux(a))






