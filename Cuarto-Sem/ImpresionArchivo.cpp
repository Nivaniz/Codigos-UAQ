#include <iostream>
#include <fstream> //Librería para manejar la lectura y escritura de archivos

using namespace std;

int main(){
	//Ofstream como un cout normal, imprimir texto
	//ifstream para imprimir lo que está en el archivo
	int outval = 19;
	
	ofstream WriteFile("miTexto.txt"); //Apertura archivo en modo escritura
	
	// el stream se maneja bajo la variable WriteFile
	
	WriteFile << outval << "\n"; //Escribimos el valor outvalen el archivo
	
	WriteFile.close(); //Cierre de archivo
	int inval;
	
	ifstream ReadFile("miTexto.txt"); //Declaracion de un archivo de lectura
	ReadFile >> inval; //Leemos el archivo y lo colocamos en inval
	
	ReadFile.close(); //Cierre del archivo
	
	cout<<"El valor escrito en el archivo es: "<<inval<<"\n";
	return 0;
	
}
