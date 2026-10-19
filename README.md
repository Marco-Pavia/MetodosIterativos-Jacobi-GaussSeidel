# Práctica: Métodos Iterativos (Jacobi y Gauss-Seidel)

**Asignatura:** Métodos Numéricos  
**Alumno:** Marco Antonio Pavia Flores  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)

---

## Descripción de la Estructura Modular
El proyecto está desarrollado en Java bajo una arquitectura modular de tres componentes:
* **`Defmatriz.java`** (Módulo 1 - Definición del Sistema): Contiene la matriz de coeficientes $A$, el vector de términos independientes $b$, la aproximación inicial $X^{(0)}$ y la tolerancia establecida ($\varepsilon = 0.0001$).
* **`MetodoJacobi.java`** (Módulo 2 - Métodos Iterativos): Implementa la lógica de cálculo del Método de Jacobi utilizando vectores auxiliares.
* **`MetodoGaussSeidel.java`** (Módulo 2 - Métodos Iterativos): Implementa la lógica del Método de Gauss-Seidel empleando la actualización inmediata de variables.
* **`MainJacobi.java`** y **`MainGaussSeidel.java`** (Módulo 3 - Ejecución): Clases principales independientes (`main`) que permiten ejecutar cada método por separado sin complicaciones.

---

## Pasos para Compilar y Ejecutar en Java

1. Asegúrate de tener instalado **Java JDK** en tu computadora.
2. Abre tu terminal o línea de comandos y sitúate en la carpeta donde se encuentran tus archivos fuente `.java`.
3. Compila todas las clases al mismo tiempo ejecutando:
   ```bash
   javac Defmatriz.java MetodoJacobi.java MetodoGaussSeidel.java MainJacobi.java MainGaussSeidel.java