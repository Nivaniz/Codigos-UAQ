# FORMA 1
phone = input("Phone: ")  # Si metes un numero te sale los numeros en letra
new_list = []

for num in phone:  # Por cada lista
    if int(num) == 1:
        print("One")
    elif int(num) == 2:
        print("Two")
    elif int(num) == 3:
        print("Three")
    elif int(num) == 4:
        print("Four")
    elif int(num) == 5:
        print("Five")
    elif int(num) == 6:
        print("Six")
    elif int(num) == 7:
        print("Seven")
    elif int(num) == 8:
        print("Eight")
    elif int(num) == 9:
        print("Nine")
    elif int(num) == 0:
        print("Cero")

# FORMA 2
phone_new = input("Phone: ")
diggits = {
    "1": "One",
    "2": "Two",
    "3": "Three",
    "4": "Four",
    "5": "Five",
}

output = ""
for character in phone_new:  # Recorrer lista
    output += diggits.get(character, "#") + " "
# diggits toma el diccionario y get busca si el número primero,segundo... está en el diccionario y lo guarda en output
print(output)