# Práctica: Métodos Iterativos (Jacobi y Gauss-Seidel)

**Asignatura:** Métodos Numéricos  
**Alumno:** Marco Antonio Pavia Flores  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)

---

## 1. Descripción y Estructura Modular del Proyecto
El proyecto está desarrollado en Java respetando una arquitectura modular de tres componentes que separa la definición del sistema, la lógica de los algoritmos iterativos y las clases de ejecución:

* **`Defmatriz.java`** (Módulo 1 - Definición del Sistema): Define y almacena los datos de entrada del sistema de ecuaciones lineales.
* **`MetodoJacobi.java`** (Módulo 2 - Métodos Iterativos): Implementa la lógica del Método de Jacobi empleando un vector auxiliar para la actualización simultánea de variables al final de cada iteración.
* **`MetodoGaussSeidel.java`** (Módulo 2 - Métodos Iterativos): Implementa la lógica del Método de Gauss-Seidel empleando la actualización inmediata de variables dentro de la misma iteración.
* **`MainJacobi.java`** y **`MainGaussSeidel.java`** (Módulo 3 - Ejecución): Clases principales independientes que permiten ejecutar cada método por separado de manera sencilla.

---

## 2. Sistema de Ecuaciones y Datos de Entrada

El sistema de ecuaciones lineales a resolver es:
 5x + y + z = 7 \\ x + 4y + z = 6 \\ x + 2y + 5z = 8

### Valores almacenados en `Defmatriz.java`:
* **Matriz de Coeficientes ($A$):**
  A = 5.0 & 1.0 & 1.0 \\ 1.0 & 4.0 & 1.0 \\ 1.0 & 2.0 & 5.0
* **Vector de Términos Independientes ($b$):**
  $$b = [7.0, \, 6.0, \, 8.0]^T$$
* **Vector de Aproximación Inicial ($X^{(0)}$):**
  $$X^{(0)} = [0.0, \, 0.0, \, 0.0]^T$$
* **Tolerancia de Error ($\varepsilon$):**
  $$\varepsilon = 0.0001$$

---

## 3. Pasos para Compilar y Ejecutar

1. Asegúrate de contar con el **Java Development Kit (JDK)** instalado en tu equipo.
2. Abre tu terminal o consola de comandos y navega hasta la carpeta del proyecto donde residen los archivos `.java`.
3. Compila todas las clases ejecutando el siguiente comando:
   ```bash
   javac Defmatriz.java MetodoJacobi.java MetodoGaussSeidel.java MainJacobi.java MainGaussSeidel.java

## 4.Opción A: Ejecutar el Método de Jacobi
Bash
java MainJacobi
## 5. Opción B: Ejecutar el Método de Gauss-Seidel
Bash
java MainGaussSeidel
## 6. Resultados de Salida por Consola
Salida de MainGaussSeidel.java:
[ 0.99999 1.00000 1.00000 ]
