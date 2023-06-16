#include <iostream>
using namespace std;

int main() {
    int numero, digitos = 0;
    
    do {
        cout << "Introduce un numero entero positivo: ";
        cin >> numero;
    } while (numero < 0); // se asegura de que el numero sea positivo
    
    do {
        numero /= 10; // elimina el ultimo digito del numero
        digitos++; // cuenta el digito eliminado
    } while (numero > 0); // sigue hasta que no haya digitos
    
    cout << "El numero tiene " << digitos << " digitos." << endl;
    
    return 0;
}

