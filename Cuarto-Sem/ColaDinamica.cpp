#include <iostream>

struct Nodo {
    int dato;           // Valor almacenado en el nodo
    Nodo* siguiente;    // Puntero al siguiente nodo en la cola
};

// Función para agregar un elemento a la cola
void agregarCola(Nodo*& head, Nodo*& tail, int n) {
    Nodo* nuevoNodo = new Nodo;     // Se crea un nuevo nodo
    nuevoNodo->dato = n;             // Se asigna el valor 'n' al dato del nuevo nodo
    nuevoNodo->siguiente = NULL;     // El puntero 'siguiente' del nuevo nodo se establece como NULL

    if (head == NULL) {
        // Si la cola está vacía, el nuevo nodo se convierte tanto en la cabeza como en la cola.
        head = nuevoNodo;
        tail = nuevoNodo;
    } else {
        // Si la cola no está vacía, se agrega el nuevo nodo al final de la cola.
        tail->siguiente = nuevoNodo;
        tail = nuevoNodo;
    }
}

// Función para mostrar los elementos en la cola
void mostrarCola(Nodo* head) {
    std::cout << "Elementos en la cola: ";
    Nodo* actual = head;
    while (actual != NULL) {
        std::cout << actual->dato << " ";  // Se muestra el valor del nodo actual
        actual = actual->siguiente;         // Se avanza al siguiente nodo
    }
    std::cout << std::endl;
}

// Función para eliminar el primer elemento de la cola
void eliminarCola(Nodo*& head, Nodo*& tail) {
    if (head == NULL) {
        // La cola está vacía, no se puede eliminar ningún elemento.
        std::cout << "La cola está vacía. No se puede eliminar ningún elemento." << std::endl;
        return;
    }

    Nodo* nodoEliminar = head;

    if (head == tail) {
        // Solo hay un elemento en la cola, se elimina y la cola se vuelve vacía.
        head = NULL;
        tail = NULL;
    } else {
        // Hay más de un elemento en la cola, se actualiza la cabeza al siguiente nodo.
        head = head->siguiente;
    }

    delete nodoEliminar;
    std::cout << "Se ha eliminado el primer elemento de la cola." << std::endl;
}

// Función para vaciar completamente la cola
void vaciarCola(Nodo*& head, Nodo*& tail) {
    Nodo* actual = head;
    while (actual != NULL) {
        Nodo* nodoEliminar = actual;
        actual = actual->siguiente;
        delete nodoEliminar;
    }
    head = NULL;
    tail = NULL;
    std::cout << "La cola se ha vaciado completamente." << std::endl;
}

// Función para buscar un elemento en la cola y obtener su posición
int buscarElemento(Nodo* head, int elemento) {
    Nodo* actual = head; // Se crea un puntero llamado "actual" y se inicializa con el puntero a la cabeza de la cola
    int posicion = 1; // Se inicializa la variable "posicion" en 1 para llevar un conteo de la posición del elemento en la cola

    while (actual != NULL) { // Se inicia un bucle que se ejecuta mientras el puntero "actual" no sea NULL
        if (actual->dato == elemento) { // Si el dato almacenado en el nodo apuntado por "actual" es igual al elemento buscado
            return posicion; // Se devuelve la posición actual del elemento en la cola
        }
        actual = actual->siguiente; // Se actualiza el puntero "actual" para avanzar al siguiente nodo en la cola
        posicion++; // Se incrementa la variable "posicion" para llevar un conteo de la posición del elemento en la cola
    }

    return -1; // Si el elemento no se encuentra en la cola, se devuelve -1 para indicar que no se encontró
}

int main() {
    Nodo* head = NULL;
    Nodo* tail = NULL;

    int opcion = 0;
    while (opcion != 6) {
        std::cout << "Menu:" << std::endl;
        std::cout << "1. Agregar elemento a la cola" << std::endl;
        std::cout << "2. Mostrar elementos en la cola" << std::endl;
        std::cout << "3. Eliminar primer elemento de la cola" << std::endl;
        std::cout << "4. Vaciar completamente la cola" << std::endl;
        std::cout << "5. Buscar elemento en la cola" << std::endl;
        std::cout << "6. Salir" << std::endl;
        std::cout << "Ingrese una opción: ";
        std::cin >> opcion;

        switch (opcion) {
            case 1: {
                int elemento;
                std::cout << "Ingrese el elemento a agregar: ";
                std::cin >> elemento;
                agregarCola(head, tail, elemento);
                break;
            }
            case 2:
                mostrarCola(head);
                break;
            case 3:
                eliminarCola(head, tail);
                break;
            case 4:
                vaciarCola(head, tail);
                break;
            case 5: {
                int elemento;
                std::cout << "Ingrese el elemento a buscar: ";
                std::cin >> elemento;
                int posicion = buscarElemento(head, elemento);
                if (posicion != -1) {
                    std::cout << "El elemento " << elemento << " se encuentra en la posicion " << posicion << " de la cola." << std::endl;
                } else {
                    std::cout << "El elemento " << elemento << " no se encuentra en la cola." << std::endl;
                }
                break;
            }
            case 6:
                std::cout << "Saliendo del programa..." << std::endl;
                break;
            default:
                std::cout << "Opción inválida. Intente nuevamente." << std::endl;
                break;
        }

        std::cout << std::endl;
    }

    return 0;
}

