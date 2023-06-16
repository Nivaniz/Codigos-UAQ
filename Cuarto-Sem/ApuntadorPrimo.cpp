#include <iostream>
using namespace std;

int main() {
    int numero;
    int *p_numero = &numero; //Apuntador
    bool esPrimo = true;

    cout << "Ingrese un entero: ";
    cin >> numero;

    if (numero < 2) {
        esPrimo = false;
    } else {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                esPrimo = false;
                break;
            }
        }
    }

    if (esPrimo) {
        cout << *p_numero << " es un numero primo." << endl;
    } else {
        cout << *p_numero << " no es un numero primo." << endl;
    }

    return 0;
}


