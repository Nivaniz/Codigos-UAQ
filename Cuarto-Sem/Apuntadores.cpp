#include <iostream>
#include <cstdlib>

using namespace std;

int main(){
	int x = 10;
	int *apEnt; //Creo apuntador
	
	apEnt = &x; //referencio el apuntador
	
	cout << "El valor de x es: " << *apEnt <<endl ; // mostramos el apuntador
	cout << "La direcci�n de el apuntador es: " << &apEnt <<endl; //mostramos la direcci�n del apuntador
	cout << "La direcci�n de x es: " << apEnt << endl; //mostramos la direcci�n de la variable con el apuntador
	cout << "La direcci�n de x es: " << &x << endl; //mostramos la direcci�n de la variable por referenciaci�n
	cout << "X + 3 es: " << *apEnt+3 << endl; // utilizando el apuntador
	cout << "(X + 3) * 2 es: " << (*apEnt+3) * 2 << endl; // utilizando el apuntador
	cout << "\n\n";
}
