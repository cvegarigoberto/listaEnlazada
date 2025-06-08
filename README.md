# CustomLinkedList - Implementación en Java

## 📌 Descripción
Este proyecto implementa una **Lista Enlazada** en Java, una estructura de datos compuesta por nodos que contienen datos y una referencia al siguiente nodo en la secuencia. A diferencia de los arreglos, las listas enlazadas permiten inserciones y eliminaciones eficientes sin necesidad de reorganizar la memoria.

### 🏗️ Estructura de Datos
La implementación se compone de las siguientes clases:
- **`Node`**: Representa cada elemento de la lista, almacenando un valor (`data`) y una referencia al siguiente nodo (`next`).
- **`CustomLinkedList`**: Implementa las operaciones básicas de la lista enlazada, como inserción, eliminación, búsqueda y obtención de tamaño.
- **`Main`**: Clase que ejecuta operaciones de prueba sobre la lista enlazada.

### 🔹 Métodos principales:
- `insert(int data)`: Inserta un nodo al inicio.
- `insert(int data, int position)`: Inserta un nodo en una posición específica.
- `delete()`: Elimina el primer nodo de la lista.
- `searchFirstInstance(int data)`: Busca la primera aparición de un valor en la lista.
- `size()`: Devuelve el número total de nodos.
- `get(int position)`: Obtiene el nodo en una posición específica.

---

## 🚀 Instrucciones para Compilar y Ejecutar

### 📥 **Requisitos**
- **Java 11+** instalado.
- **JUnit 5** para ejecutar pruebas unitarias.

### 🏗️ **Compilar el Código**
Ejecuta el siguiente comando desde la terminal en la carpeta del proyecto:
```sh
javac Node.java CustomLinkedList.java Main.java
```
### 🏗️ **Ejecuta con**

```sh
java Main

```
