#include <fstream>
#include <iostream>

using namespace std;

int main() {
    int outval = 69;
    string nameFile,texto;
    ofstream WriteFile;
    cout << "Escribe el nombre del archivo: ";
    //cin >> nameFile;
    getline (cin,nameFile);
    //WriteFile.open(nameFile.c_str());
    WriteFile.open(nameFile);
    WriteFile << outval << "\n";
    cout << "Escribe texto en tu archivo: ";
    getline(cin,texto);
    WriteFile << texto;


    WriteFile.close();

    int inVal;
    ifstream ReadFile (nameFile.c_str());
    ReadFile >> inVal;
    ReadFile.close();

    cout << "\n";
    cout << "El valor escrito en el archivo es: " << inVal;
    cout << "\n\n";

}
