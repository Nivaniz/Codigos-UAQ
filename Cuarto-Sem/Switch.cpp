#include <iostream>
#include <map>
#include <string>

int main() {
    std::map<int, std::string> colores;
    // está creando una instancia de un objeto map que asocia claves enteras con valores de tipo cadena de caracteres.
	// En otras palabras, estamos creando una estructura de datos que puede almacenar nombres de colores, y la asocia en colores
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "blanco";
    colores[4] = "amarrillo";
    colores[5] = "morado";
    colores[6] = "gris";
    colores[7] = "verde";
    
    int color = 1; // Supongamos que el color seleccionado es el número 2 (azul)
    std::string nombre_color;
    // Acceder a los valores del diccionario
    
    switch (color) {
        case 1:
            std::cout << "El color asociado al numero 1 es " << colores[1] << std::endl;
            break;
        case 2:
        	std::cout << "El color asociado al numero 2 es " << colores[2] << std::endl;
            break;
        case 3:
               std::cout << "El color asociado al numero 3 es " << colores[3] << std::endl;
            break;
        case 4:
               std::cout << "El color asociado al numero 4 es " << colores[4] << std::endl;
            break;
        case 5:
               std::cout << "El color asociado al numero 5 es " << colores[5] << std::endl;
            break;
        case 6: 
               std::cout << "El color asociado al numero 6 es " << colores[6] << std::endl;
            break;
        case 7:
               std::cout << "El color asociado al numero 3 es " << colores[7] << std::endl;
            break;
        default:
            nombre_color = "El numero no corresponde a este conjunto";
            break;
    }
    
    return 0;
}

