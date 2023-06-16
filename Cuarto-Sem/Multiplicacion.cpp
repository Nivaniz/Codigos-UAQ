#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int num;
    cout << "Ingresa un número: ";
    cin >> num;

    ofstream archivo("archivo.txt");
    if (archivo.is_open()) {
        for (int i = 1; i <= 10; i++) {
            archivo << num << " x " << i << " = " << num*i << endl;
        }
        archivo.close();
        cout << "Se ha escrito la tabla de multiplicar en el archivo 'archivo.txt'" << endl;
    } else {
        cout << "No se pudo abrir el archivo 'archivo.txt'" << endl;
    }
    return 0;
}

