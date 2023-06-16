#include <iostream>
#include <cstdlib>
 
// short vale 2 bytes, int vale 4 bytes
using namespace std;

int main(){
	short arreglo[10]={0,1,2,3,4,5,6,7,8,9};
	short *aptArreglo;
	
	aptArreglo = arreglo;
	cout << "\n";
	
	for (int i=0; i<10; i++ ){
		cout << "Posicion [" << i << "]" << "Dirección:" << &aptArreglo[i];
		cout << "\n";
	}
		
}
