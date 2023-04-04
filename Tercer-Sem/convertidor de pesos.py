# Convertidor de pesos
weight = int(input('Weight: '))
libra_Kilo = input('(L)bs or (K)g')

if libra_Kilo.upper() == 'L':
    converted = weight * 0.45
    print(f"You are {converted} kilos")
elif libra_Kilo.upper() == 'K':
    converted = weight / 0.45  # / tenemos float con // tenemos integer
    print(f"You are {converted} pounds")
else:
    print("You are putting something wrong")