#include <iostream>
#include <string>

using namespace std;

int main() {
    // Creamos el array de punteros a cadenas de caracteres
    string* meses[12] = {
        new string("Enero"), 
        new string("Febrero"), 
        new string("Marzo"), 
        new string("Abril"), 
        new string("Mayo"), 
        new string("Junio"), 
        new string("Julio"), 
        new string("Agosto"), 
        new string("Septiembre"), 
        new string("Octubre"), 
        new string("Noviembre"), 
        new string("Diciembre")
    };
    
    // Pedimos al usuario que ingrese un número entero del 1 al 12
    int num_mes;
    cout << "Ingrese un numero entero del 1 al 12: ";
    cin >> num_mes;
    
    // Validamos que el número ingresado esté en el rango correcto
    if (num_mes >= 1 && num_mes <= 12) {
        // Imprimimos el nombre del mes correspondiente
        cout << "El mes correspondiente al numero " << num_mes << " es: " << *(meses[num_mes-1]) << endl;
    } else {
        // Si el número ingresado está fuera de rango, mostramos un mensaje de error
        cout << "Error: el numero ingresado está fuera de rango." << endl;
    }
    
    // Liberamos la memoria asignada a cada cadena de caracteres
    for (int i = 0; i < 12; i++) {
        delete meses[i];
    }
    
    return 0;
}

