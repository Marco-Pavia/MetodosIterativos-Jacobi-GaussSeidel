// Marco Antonio Pavia Flores
// MetodoGaussSeidel.java

public class MetodoGaussSeidel {

    /**
     * Resuelve un sistema de ecuaciones lineales Ax = b
     * mediante el método iterativo de Gauss-Seidel.
     *
     * @param A       Matriz de coeficientes (cuadrada)
     * @param b       Vector de términos independientes
     * @param x0      Vector de aproximación inicial
     * @param tol     Tolerancia o error máximo permitido
     * @param maxIter Número máximo de iteraciones
     * @return Vector con la solución aproximada
     */
    public static double[] resolver(double[][] A, double[] b, double[] x0, double tol, int maxIter) {
        int n = b.length;
        double[] x = x0.clone(); // Vector de solución que se va actualizando iterativamente

        // Ciclo principal de iteraciones
        for (int k = 0; k < maxIter; k++) {
            double[] xAnt = x.clone(); // Copia del vector antes de la iteración para calcular el error

            // Cálculo de cada variable para la iteración actual
            for (int i = 0; i < n; i++) {
                double suma = 0.0; // Se resetea la suma de cada fila

                // Sumatoria de los términos A[i][j] * x[j] excluyendo la diagonal (j != i)
                // Se utilizan los valores recién actualizados de 'x' inmediatamente
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma += A[i][j] * x[j];
                    }
                }

                // Fórmula de despeje de Gauss-Seidel: x_i = (b_i - suma) / A[i][i]
                x[i] = (b[i] - suma) / A[i][i];
            }

            // Evalúa si ya se alcanzó la precisión deseada (criterio de parada)
            if (calcularError(xAnt, x) < tol) {
                return x; // Convergió con éxito
            }
        }

        // Retorna la última aproximación si se agotan las iteraciones sin converger del todo
        return x;
    }

    /**
     * Calcula el error máximo absoluto entre dos vectores (norma infinito).
     */
    public static double calcularError(double[] xAnt, double[] xNuevo) {
        double max = 0.0;
        for (int i = 0; i < xAnt.length; i++) {
            // Encuentra la máxima diferencia absoluta entre elementos correspondientes
            max = Math.max(max, Math.abs(xNuevo[i] - xAnt[i]));
        }
        return max;
    }
}