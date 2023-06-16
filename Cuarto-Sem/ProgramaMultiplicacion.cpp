#include <iostream>
#include <fstream>
using namespace std;

int main() {
    int num;
    cout << "Ingresa un numero: ";
    cin >> num;

    string nombreArchivo;
    cout << "Ingrese el nombre del archivo: ";
    cin >> nombreArchivo;

    ofstream archivo(nombreArchivo.c_str());  // Abrimos y creamos el archivo con el nombre ingresado por el usuario
    if (archivo.is_open()) {  // Si el archivo está abierto
        for (int i = 1; i <= 10; i++) {  // Iteramos del 1 al 10 
            archivo << num << " x " << i << " = " << num*i << endl;  // Damos formato multiplicando el numero ingresado x la iteración
        }
        archivo.close();  // Lo cerramos
        cout << "Se ha escrito la tabla de multiplicar en el archivo '" << nombreArchivo << "'" << endl;  // Escribimos que se ejecuto exitosamente
    } else {
        cout << "No se pudo abrir el archivo '" << nombreArchivo << "'" << endl;  // Si no se ejecutó correctamente
    }
    return 0;
}



