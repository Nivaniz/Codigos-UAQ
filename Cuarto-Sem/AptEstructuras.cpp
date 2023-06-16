#include <iostream>
#include <cstdlib>
#include <cstring>

using namespace std;

struct Data{
    char Nombre [15];
    int Edad;
};

int main() {
    Data *aptData = new Data();
    if(aptData!= NULL){
        strcpy(aptData->Nombre, "Lucy");
        aptData->Edad= 21;
        cout<<"\n";
        cout<<"El nombre es: " << aptData->Nombre << "\n";
        cout<<"La Edad es: " << aptData->Edad << "\n";
        cout<<"\n\n";
        delete aptData;
    }
	
    Data *aptData2 = new Data[5]();
    if(aptData2 != NULL){
        for(int i=0; i<5;i++){
            cout << "Ingresa un nombre: ";
            cin >> aptData2[i].Nombre;
            cout << "Ingresa la edad: ";
            cin >> aptData2[i].Edad;

        }
        for(int i=0; i<5; i++) {
            cout << "\n";
            cout << "El nombre es: " << aptData2[i].Nombre << "\n";
            cout << "La Edad es: " << aptData2[i].Edad << "\n";
            cout << "\n\n";
        }
        delete [] aptData2;
    }
    return 0;
}

