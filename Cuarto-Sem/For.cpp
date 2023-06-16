#include <iostream>

using namespace std;

int main() {
    int suma = 0;

    for (int i = 1; i <= 20; i++) {
        int cuadrado = i * i;
        suma += cuadrado;
        cout << "El " << i << " elevado al cuadrado es: " << cuadrado << endl;
    }

    cout << "La suma de los cuadrados es: " << suma << endl;

    return 0;
}


