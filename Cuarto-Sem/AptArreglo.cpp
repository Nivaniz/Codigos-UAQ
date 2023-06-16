#include <iostream>
#include <cstdio>

using namespace std;

int main(){
	
	short arreglo [10], *aptarreg;
	aptarreg = &arreglo[0];
	cout << "La dirección del arreglo es: " << &arreglo << endl;
	cout << "La dirección del arreglo en la primera posicion es: " << &arreglo[0] << endl;
	cout << "La dirección del arreglo en la decima posicion: " << &arreglo[9] << endl;
	 
}
