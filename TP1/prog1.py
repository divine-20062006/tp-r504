
print("hello, world!")

while True:
    a = input("Entrez un nombre (ou CTRL-C pour quitter) : ")
    b = input("Entrez un autre nombre (ou CTRL-C pour quitter) : ")
    nombreA = float(a)
    nombreB = float(b)

    resultat = nombreA ** nombreB
    print (f"Le résultat de {nombreA} élevé à la puissance {nombreB} est : {resultat}")
