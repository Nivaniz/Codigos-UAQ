#include <iostream>
#include <vector>
using namespace std;

// Función para realizar el recorrido euleriano
void eulerianPath(vector<vector<int>>& graph, vector<int>& path, int node) {
    // Iterar sobre todas las aristas del nodo actual
    for (int i = 0; i < graph[node].size(); i++) {
        int nextNode = graph[node][i];
        // Verificar si la arista no ha sido visitada (marcada como -1)
        if (nextNode != -1) {
            graph[node][i] = -1;  // Marcar la arista como visitada
            eulerianPath(graph, path, nextNode);  // Llamada recursiva para continuar el recorrido desde el siguiente nodo
        }
    }
    path.push_back(node);  // Agregar el nodo actual al recorrido euleriano
}

// Función principal
int main() {
    int numNodes, numEdges;
    cout << "Ingrese el número de nodos: ";
    cin >> numNodes;
    cout << "Ingrese el número de aristas: ";
    cin >> numEdges;

    vector<vector<int>> graph(numNodes);

    cout << "Ingrese las aristas (en formato nodo_origen nodo_destino):" << endl;
    for (int i = 0; i < numEdges; i++) {
        int u, v;
        cin >> u >> v;
        graph[u].push_back(v);  // Agregar la arista al grafo en la lista de adyacencia del nodo origen
    }

    vector<int> path;
    eulerianPath(graph, path, 0);  // Comenzar el recorrido desde el nodo 0

    cout << "El recorrido euleriano es:" << endl;
    for (int i = path.size() - 1; i >= 0; i--) {
        cout << path[i] << " ";  // Imprimir el recorrido euleriano en orden inverso
    }
    cout << endl;

    return 0;
}

