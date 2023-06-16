#include <iostream>
#include <stdlib.h>
#include "conio.h"

using namespace std;

int main(void) {
	
	float n1,n2,n3;
	
	cout <<"Favor de ingresar la longitud: ";
	cin >> n1;
	cout <<"Favor de ingresar apotema: ";
	cin >> n2;
	cout <<"Favor de ingresar el numero de lados: ";
	cin >> n3;
	
	cout <<"El area del poligono regular de n lados es de: " << ( (n3 * n1 * n2) / 2);
	cout <<" Y el perimetro del poligono regular es de: " << n1 * n3;
	return EXIT_SUCCESS;
}
