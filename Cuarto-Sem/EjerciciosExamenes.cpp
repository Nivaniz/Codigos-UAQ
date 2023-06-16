#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Ingrese un numero para la serie de Fibonacci: ";
    cin >> num;

    if (num <= 0) {
        cout << "El numero debe ser positivo" << endl;
        return 0;
    }

    int a = 1, b = 1;  // Inicializamos las dos primeras variables de la serie
    cout << a << " " << b << " ";  // Imprimimos las dos primeras variables

    for (int i = 2; i < num; i++) {
        int c = a + b;  // Calculamos la siguiente variable de la serie
        cout << c << " ";  // Imprimimos la variable calculada
        a = b;  // Actualizamos las variables
        b = c;
    }

    cout << endl;
    return 0;
}

