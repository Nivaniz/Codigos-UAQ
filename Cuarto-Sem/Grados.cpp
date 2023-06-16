#include <iostream>
 
using namespace std;
 
int main() {
    int temperatura,opc,celcius;
    float f,k;
    const float KELVIN = 273.15;
 
    do {
        cout << "Ingrese temperatura mayor o igual a 0: ";
        cin >> temperatura;
        if (temperatura < 0)
            cout << "Error, la temperatura debe ser >= 0" << endl;
    } while (temperatura < 0);
 
    //menu
    do {
        cout << "\n1. Convertir de grados Celcuis a Kelvin" << endl;
        cout << "2. Convertir de grados Celcuis a Fahrenheit" << endl;
        cout << "3. Salir";
        cout << endl << "Digite una opcion: ";
        cin >>opc;
 
        switch (opc) {
            case 1:
                k = temperatura + KELVIN;
                cout << "Temperatura en kelvin = " << k << endl;
            break;
            case 2:
                f = (temperatura * 9 / 5) + 32;
                cout << "Temperatura en Fahrenheit = " << f << endl;
            break;
        }
 
    } while (opc < 3);
 
    return 0;
}
