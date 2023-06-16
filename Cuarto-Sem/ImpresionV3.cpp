#include <iostream>
#include <fstream>


using namespace std;


int main(int argc, char** argv) {
	
	
	//ifstream para imprimir lo que está en el archivo
	//ofstream te pemite escribir en el archivo
	//int outval = 19;
	
	string filename, texto;
    
    ofstream WriteFile; //Ofstream como un cout normal, imprimir texto
    cout << "Ingresa el nombre del archivo: ";
    getline(cin,filename);  
    WriteFile.open(filename.c_str());
    
    //WriteFile << outval << endl;
    
    cout << "Escribe un texto en tu archivo: ";
    getline(cin,texto);
    WriteFile << texto;
    WriteFile.close();

    cout << endl << "Archivo " << filename << " creado correctamente." << endl;
	
	int inval;
	
	ifstream ReadFile("miTexto.txt"); //Declaracion de un archivo de lectura, readFile puede ser cualquie valor
	if (ReadFile.fail()){
		cout<< "El archivo no se encuentra";
		exit(1);
	}
	else{
		ReadFile >> inval; //Leemos el archivo y lo colocamos en inval
		ReadFile.close(); //Cierre del archivo
		cout<< endl << "El valor escrito en el archivo es: "<< texto <<"\n";
		return 0;
	}

}
