#include <iostream>
#include <cstdlib>

using namespace std;

int miFuncionVal(int,int);
int miFuncionRef(int &,int &);

int main(){
	int a=10, b=20;
	
	cout << "Los valores de a y b respectivamente son: " << a << "," << b << endl;
	cout << "Funcion con pasos por valor " << miFuncionVal(a,b) << endl;
	cout << "Los valores de a y b respectivamente son: " << a << "," << b << endl;
	cout << "Funcion con pasos por referencia " << miFuncionRef(a,b)<< endl;
	cout << "Los valores de a y b respectivamente son: " << a << "," << b<< endl;
		
}

int miFuncionVal(int n, int m){
	n = n+2;
	m = n - 5;
	return (n+m);
}

int miFuncionRef(int &n, int &m){
	n = n+2;
	m = n - 5;
	return (n+m);
}
