#include <iostream>
#include <cstdlib>
#include <cmath>


using namespace std;

int main(int argc, char** argv) {
	
	int datInt;
    int entero = 10;
    float flotante = 1.5;
    double doble = 3.1416;
    char caracter = 'D';
	
	cout <<"\n";
	cout <<"Este es un Dato Entero: " << entero << "\n";
	cout <<"Este es un Dato Flotante: " << flotante << "\n";
	cout <<"Este es un Dato Doble: " << doble << "\n";
	cout <<"Este es un Dato Caracter: " << caracter << "\n";
	cout <<"Ingresa un numero entero: ";
	cin >> datInt;
	
	cout <<"El Dato Ingresado Multiplicado por 5 es: "<< datInt * 5 << "\n";
	cout <<"El Dato Ingresado Elevado a la 5 potencia es: "<< pow(datInt,5) << "\n";
	cout << "\n";
}
