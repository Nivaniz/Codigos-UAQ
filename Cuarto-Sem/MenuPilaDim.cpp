#include <iostream>

using namespace std;

struct Nodo {
    int dato;
    Nodo* siguiente;
};

void push(Nodo*& pila, int dato) {
    Nodo* nuevoNodo = new Nodo();
    nuevoNodo->dato = dato;
    nuevoNodo->siguiente = pila;
    pila = nuevoNodo;
}

void pop(Nodo*& pila) {
    if (pila != NULL) {
        Nodo* nodoEliminar = pila;
        pila = pila->siguiente;
        delete nodoEliminar;
    }
}

void imprimirPila(Nodo* pila) {
    Nodo* temp = pila;
    while (temp != NULL) {
        cout << temp->dato << " ";
        temp = temp->siguiente;
    }
    cout << endl;
}

int buscarElemento(Nodo* pila, int dato) {
    Nodo* temp = pila;
    int posicion = 0;
    while (temp != NULL) {
        if (temp->dato == dato) {
            return posicion;
        }
        temp = temp->siguiente;
        posicion++;
    }
    return -1;
}

void vaciarPila(Nodo*& pila) {
    while (pila != NULL) {
        pop(pila);
    }
    cout << "Pila vaciada." << endl;
}

int main() {
    Nodo* pila = NULL;

    int opcion;
    int dato;
    int posicion;  // Variable posicion movida fuera del switch

    do {
        cout << "Menu:" << endl;
        cout << "1) Ingresar dato a la pila" << endl;
        cout << "2) Eliminar dato de la pila" << endl;
        cout << "3) Imprimir pila actual" << endl;
        cout << "4) Buscar elemento en la pila" << endl;
        cout << "5) Vaciar la pila" << endl;
        cout << "6) Salir" << endl;
        cout << "Ingrese la opcion: ";
        cin >> opcion;

        switch (opcion) {
            case 1:
                cout << "Ingrese el dato a agregar a la pila: ";
                cin >> dato;
                push(pila, dato);
                cout << "Dato agregado a la pila." << endl;
                break;
            case 2:
                pop(pila);
                cout << "Nodo eliminado de la pila." << endl;
                break;
            case 3:
                cout << "Pila actual: ";
                imprimirPila(pila);
                break;
            case 4:
                cout << "Ingrese el elemento a buscar: ";
                cin >> dato;
                posicion = buscarElemento(pila, dato);  // Asignar el resultado a la variable posicion
                if (posicion != -1) {
                    cout << "El elemento " << dato << " se encuentra en la posicion " << posicion << " de la pila." << endl;
                } else {
                    cout << "El elemento " << dato << " no se encuentra en la pila." << endl;
                }
                break;
            case 5:
                vaciarPila(pila);
                break;
            case 6:
                cout << "Saliendo del programa." << endl;
                break;
            default:
                cout << "Opcion invalida. Intente de nuevo." << endl;
        }

        cout << endl;
    } while (opcion != 6);

    return 0;
}


