#include <iostream>
#include <cstdlib>

using namespace std;

// Definición de la estructura Nodo
struct Nodo {
    int data;
    Nodo* next;
};

// Declaración de funciones
void insertarLista(Nodo*& head, int);
void mostrarLista(Nodo*);
void buscarLista(Nodo*, int);
void eliminarElemento(Nodo*&, int);
void vaciarLista(Nodo*&);

Nodo* head = NULL; // Puntero al primer nodo de la lista (inicializado como NULL)

int main() {
    int n, opcion, buscar, eliminar;
    bool salir = false;

    do {
        // Mostrar el menú y obtener la opción del usuario
        cout << "MENU\n";
        cout << "1. Ingresar nodo\n";
        cout << "2. Buscar nodo\n";
        cout << "3. Mostrar lista\n";
        cout << "4. Eliminar un elemento de la lista\n";
        cout << "5. Vaciar la lista\n";
        cout << "6. Salir\n";
        cout << "Ingrese su opcion: ";
        cin >> opcion;
        system("cls");

        switch (opcion) {
            case 1:
                // Insertar un nodo en la lista
                cout << "Ingrese un numero entero: ";
                cin >> n;
                insertarLista(head, n);
                cout << "\n";
                break;
            case 2:
                // Buscar un elemento en la lista
                cout << "Ingrese el elemento a buscar: ";
                cin >> buscar;
                buscarLista(head, buscar);
                cout << "\n";
                break;
            case 3:
                // Mostrar la lista enlazada
                cout << "\n Los elementos que contiene la lista son: ";
                mostrarLista(head);
                cout << "\n";
                break;
            case 4:
                // Eliminar un elemento de la lista
                cout << "Ingrese el elemento a eliminar: ";
                cin >> eliminar;
                eliminarElemento(head, eliminar);
                cout << "\n";
                break;
            case 5:
                // Vaciar la lista
                cout << "Se vacio la lista exitosamente ";
                vaciarLista(head);
                cout << "\n";
                break;
            case 6:
                // Salir del programa
                salir = true;
                break;
            default:
                cout << "Opcion invalida\n";
                break;
        }
    } while (!salir);

    // Mostrar la lista final después de que el usuario haya terminado
    cout << "\n Los elementos que contiene la lista son: ";
    mostrarLista(head);
    cout << "\n";

    return 0;
}

// Eliminar un elemento de la lista
void eliminarElemento(Nodo*& head, int eliminar) {
    Nodo* actual = head;
    Nodo* anterior = NULL;
    bool encontrado = false;

    // Buscar el elemento en la lista
    while (actual != NULL && !encontrado) {
        if (actual->data == eliminar) {
            encontrado = true;
        } else {
            anterior = actual;
            actual = actual->next;
        }
    }

    // Si se encuentra el elemento, eliminarlo de la lista
    if (encontrado) {
        if (anterior == NULL) {
            // El elemento a eliminar es el primer nodo
            head = head->next;
        } else {
            // El elemento a eliminar no es el primer nodo
            anterior->next = actual->next;
        }
        delete actual; // Liberar memoria del nodo eliminado
        cout << "El elemento " << eliminar << " ha sido eliminado de la lista\n";
    } else {
        cout << "El elemento " << eliminar << " no se encuentra en la lista\n";
    }
}

// Insertar un nodo al final de la lista
void insertarLista(Nodo*& head, int n) {
    Nodo* new_nodo = new Nodo(); // Crear un nuevo nodo
    new_nodo->data = n;
    new_nodo->next = NULL;

    if (head == NULL) {
        // Si la lista está vacía, el nuevo nodo se convierte en el primer nodo
        head = new_nodo;
    } else {
        // Si la lista no está vacía, recorrer hasta el último nodo y enlazar el nuevo nodo al final
        Nodo* aux = head;
        while (aux->next != NULL) {
            aux = aux->next;
        }
        aux->next = new_nodo;
    }

    cout << "El dato ha ingresado a la lista\n";
}

// Vaciar la lista 
void vaciarLista(Nodo*& head) {
    Nodo* aux = head;
    Nodo* aux_borrar = NULL;
    while (aux != NULL) {
        aux_borrar = aux;
        aux = aux->next;
        delete aux_borrar;
    }
    head = NULL;
    cout << "La lista ha sido vaciada\n";
}

// Mostrar la lista enlazada
void mostrarLista(Nodo* head) {
    Nodo* actual = head;
    while (actual != NULL) {
        cout << actual->data << " -> ";
        actual = actual->next;
    }
}

// Buscar un elemento en la lista
void buscarLista(Nodo* head, int buscar) {
    Nodo* actual = head;
    int pos = 1;
    bool encontrado = false;
    while (actual != NULL) {
        if (actual->data == buscar) {
            encontrado = true;
            cout << "El elemento " << buscar << " se encuentra en la posicion " << pos << endl;
            break;
        }
        actual = actual->next;
        pos++;
    }
    if (!encontrado) {
        cout << "El elemento " << buscar << " no se encuentra en la lista\n";
    }
}


