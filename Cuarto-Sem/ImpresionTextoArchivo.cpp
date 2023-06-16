#include <iostream>
#include <fstream> //Librer�a para manejar la lectura y escritura de archivos

using namespace std;

int main(){
	//Ofstream como un cout normal, imprimir texto
	//ifstream para imprimir lo que est� en el archivo
	int outval = 19;
	
	string nombreArchivo, texto;

    cout << "Ingrese el nombre del archivo: ";
    cin >> nombreArchivo;

    cout << "Ingrese el texto a escribir en el archivo: ";
    cin.ignore(); // Ignorar el salto de l�nea residual en el buffer de entrada
    getline(cin, texto); // Leer toda la l�nea, incluyendo espacios en blanco

    ofstream archivo(nombreArchivo.c_str());

    if (archivo.is_open()) {
        archivo << "19 " << texto;
        cout << "Se ha escrito en el archivo " << nombreArchivo << endl;
        archivo.close();
    } else {
        cout << "No se pudo abrir el archivo " << nombreArchivo << endl;
    }

	int inval;
	
	ifstream ReadFile("miTexto.txt"); //Declaracion de un archivo de lectura
	ReadFile >> inval; //Leemos el archivo y lo colocamos en inval
	
	ReadFile.close(); //Cierre del archivo
	
	cout<<"El valor escrito en el archivo es: "<<inval<<"\n";
	
	return 0;
	
}
