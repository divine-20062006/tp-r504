def puissance(a, b):
    if not type(a) is int or not type(b) is int:
        raise TypeError("Seuls les entiers sont autorises")
    if a == 0 and b < 0:
        raise ValueError("0 ne peut pas etre eleve a une puissance negative")
    if a == 0 and b == 0:
        raise ValueError("0 puissance 0 est une forme indeterminee")
    
    if b == 0:
        return 1
    
    res = 1
    for _ in range(abs(b)):
        res *= a
        
    if b < 0:
        return 1 / res
        
    return res