def puissance(a, b):
    if not type(a) is int or not type(b) is int:
        raise TypeError("Seuls les entiers sont autorises")
    if a == 0 and b < 0:
        raise ValueError("0 ne peut pas etre eleve a une puissance negative")
    return a ** b