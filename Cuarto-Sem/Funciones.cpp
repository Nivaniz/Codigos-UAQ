#include <iostream>
using namespace std;

// Prototipos de las funciones
int suma(int a, int b);
float promedio(int a, int b);

// Función principal
int main() {
    int num1, num2;
    cout << "Ingrese el primer valor: ";
    cin >> num1;
    cout << "Ingrese el segundo valor: ";
    cin >> num2;

    // Llamadas a las funciones
    int s = suma(num1, num2);
    float p = promedio(num1, num2);

    // Impresión de los resultados
    cout << "La suma es: " << s << endl; //manipulador de flujo que se utiliza para insertar un salto de línea y vaciar el búfer del flujo de salida. Es equivalente a escribir \n 
    cout << "El promedio es: " << p << endl;

    return 0;
}

// Definición de la función "suma"
int suma(int a, int b) {
    return a + b;
}

// Definición de la función "promedio"
float promedio(int a, int b) {
    return (a + b) / 2.0;
}
