#include <iostream> // Incluye la biblioteca iostream para utilizar las funciones de entrada/salida est�ndar de C++
#include <set> // Incluye la biblioteca set para utilizar conjuntos en C++

using namespace std; // Permite el uso directo de elementos de la biblioteca est�ndar de C++ sin especificar el prefijo "std::"

struct Nodo { // Define una estructura llamada Nodo para representar los nodos de la pila
    int dato; // Almacena el dato en el nodo de la pila
    Nodo* siguiente; // Puntero al siguiente nodo en la pila
};

void push(Nodo*& pila, int dato) { // Inserta un nuevo elemento en la pila
    Nodo* nuevoNodo = new Nodo(); // Crea un nuevo nodo
    nuevoNodo->dato = dato; // Asigna el dato al nuevo nodo
    nuevoNodo->siguiente = pila; // Establece el siguiente del nuevo nodo como la pila actual
    pila = nuevoNodo; // Actualiza la referencia de la pila al nuevo nodo
}

void pop(Nodo*& pila) { // Elimina el elemento superior de la pila
    if (pila != NULL) { // Verifica si la pila no est� vac�a
        Nodo* nodoEliminar = pila; // Almacena el nodo superior de la pila en una variable temporal
        pila = pila->siguiente; // Actualiza la referencia de la pila al siguiente nodo
        delete nodoEliminar; // Libera la memoria del nodo eliminado
    }
}

void imprimirPila(Nodo* pila) { // Imprime los elementos de la pila
    Nodo* temp = pila; // Crea un nodo temporal para recorrer la pila
    while (temp != NULL) { // Mientras el nodo temporal no sea nulo
        cout << temp->dato << " "; // Imprime el dato del nodo temporal
        temp = temp->siguiente; // Avanza al siguiente nodo en la pila
    }
    cout << endl; // Imprime un salto de l�nea al finalizar la impresi�n de la pila
}

int buscarElemento(Nodo* pila, int dato) { // Busca un elemento en la pila y devuelve su posici�n
    Nodo* temp = pila; // Crea un nodo temporal para recorrer la pila
    int posicion = 0; // Inicializa la posici�n en 0
    while (temp != NULL) { // Mientras el nodo temporal no sea nulo
        if (temp->dato == dato) { // Compara el dato del nodo temporal con el dato buscado
            return posicion; // Devuelve la posici�n si el dato es encontrado
        }
        temp = temp->siguiente; // Avanza al siguiente nodo en la pila
        posicion++; // Incrementa la posici�n en cada iteraci�n
    }
    return -1; // Devuelve -1 si el dato no es encontrado
}

void vaciarPila(Nodo*& pila) { // Vacia todos los elementos de la pila
    while (pila != NULL) { // Mientras la pila no est� vac�a
        pop(pila); // Elimina el elemento superior de la pila
    }
    cout << "Pila vaciada." << endl; // Imprime un mensaje indicando que la pila ha sido vaciada
}

int main() { // Funci�n principal del programa
    Nodo* pila = NULL; // Inicializa la pila como una lista vac�a

    set<int> numerosIngresados; // Crea un conjunto para rastrear los n�meros ingresados

    int opcion; // Variable para almacenar la opci�n del men� seleccionada
    int numElementos; // Variable para almacenar el n�mero de elementos a agregar a la pila
    int dato; // Variable para almacenar un dato ingresado por el usuario
    int numEliminar; // Variable para almacenar el n�mero de elementos a eliminar de la pila
    int posicion; // Variable para almacenar la posici�n de un elemento en la pila

    do { // Inicio del bucle do-while, el men� se muestra al menos una vez y luego se repite seg�n la opci�n seleccionada
        cout << "Menu:" << endl; // Imprime el men� principal
        cout << "1) Ingresar elementos a la pila" << endl;
        cout << "2) Eliminar elementos de la pila" << endl;
        cout << "3) Imprimir pila actual" << endl;
        cout << "4) Buscar elemento en la pila" << endl;
        cout << "5) Vaciar la pila" << endl;
        cout << "6) Salir" << endl;
        cout << "Ingrese la opcion: "; // Solicita al usuario que ingrese la opci�n
        cin >> opcion; // Lee la opci�n ingresada por el usuario

        switch (opcion) { // Eval�a la opci�n seleccionada por el usuario
            case 1: // Opci�n 1: Ingresar elementos a la pila
                cout << "Ingrese el numero de elementos a agregar a la pila: ";
                cin >> numElementos; // Lee el n�mero de elementos a agregar a la pila
                for (int i = 0; i < numElementos; i++) { // Bucle para ingresar cada elemento
                    bool esDuplicado; // Variable booleana para controlar si se ingresa un n�mero duplicado
                    do { // Bucle do-while para verificar duplicados
                        esDuplicado = false; // Inicialmente, no se considera un duplicado
                        cout << "Ingrese el elemento #" << i + 1 << ": ";
                        cin >> dato; // Lee el dato ingresado por el usuario
                        if (numerosIngresados.count(dato) > 0) { // Verifica si el n�mero ya est� en el conjunto de n�meros ingresados
                            esDuplicado = true; // Marca como duplicado si el n�mero ya existe
                            cout << "El elemento " << dato << " ya se encuentra en la pila. Intente nuevamente." << endl;
                        }
                    } while (esDuplicado); // Repite el bucle hasta que se ingrese un n�mero no duplicado
                    numerosIngresados.insert(dato); // Agrega el n�mero al conjunto de n�meros ingresados
                    push(pila, dato); // Inserta el dato en la pila
                    cout << "Elemento agregado a la pila." << endl;
                }
                break;
            case 2: // Opci�n 2: Eliminar elementos de la pila
                cout << "Ingrese el numero de elementos a eliminar de la pila: ";
                cin >> numEliminar; // Lee el n�mero de elementos a eliminar de la pila
                for (int i = 0; i < numEliminar; i++) { // Bucle para eliminar cada elemento
                    pop(pila); // Elimina el elemento superior de la pila
                    cout << "Elemento eliminado de la pila." << endl;
                }
                break;
            case 3: // Opci�n 3: Imprimir pila actual
                cout << "Pila actual: ";
                imprimirPila(pila); // Imprime los elementos de la pila
                break;
            case 4: // Opci�n 4: Buscar elemento en la pila
                cout << "Ingrese el elemento a buscar: ";
                cin >> dato; // Lee el dato a buscar en la pila
                posicion = buscarElemento(pila, dato); // Busca el elemento y almacena su posici�n
                if (posicion != -1) { // Si la posici�n es v�lida (distinta de -1), el elemento fue encontrado
                    cout << "El elemento " << dato << " se encuentra en la posicion " << posicion << " de la pila." << endl;
                } else {
                    cout << "El elemento " << dato << " no se encuentra en la pila." << endl;
                }
                break;
            case 5: // Opci�n 5: Vaciar la pila
                vaciarPila(pila); // Vac�a todos los elementos de la pila
                numerosIngresados.clear(); // Limpia el conjunto de n�meros ingresados al vaciar la pila
                break;
            case 6: // Opci�n 6: Salir del programa
                cout << "Saliendo del programa." << endl;
                break;
            default: // Opci�n por defecto: Opci�n inv�lida
                cout << "Opcion invalida. Intente de nuevo." << endl;
        }

        cout << endl; // Imprime un salto de l�nea para separar las iteraciones del men�
    } while (opcion != 6); // El bucle se repite mientras la opci�n seleccionada no sea 6 (Salir del programa)

    return 0; // Finaliza el programa
}

