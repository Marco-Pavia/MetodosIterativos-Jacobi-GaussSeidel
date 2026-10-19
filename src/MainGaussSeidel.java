// Marco Antonio Pavia Flores
// MainGaussSeidel.java

public class MainGaussSeidel {

    public static void main(String[] args) {
        // Cargamos la matriz y los vectores desde la clase externa
        double[][] A = Defmatriz.obtenerMatrizA();
        double[] b = Defmatriz.obtenerVectorB();
        double[] x0 = Defmatriz.obtenerVectorX0();

        // Parámetros de tolerancia (0.0001 solicitado en la guía) y límite de iteraciones
        double tol = 0.0001; //
        int maxIter = 100;

        // Llamada al método resolver de Gauss-Seidel
        double[] solucion = MetodoGaussSeidel.resolver(A, b, x0, tol, maxIter);

        // Imprimir el resultado final
        System.out.print("Solución aproximada (Metodo Gauss-Seidel): [ ");
        for (double val : solucion) {
            System.out.printf("%.5f ", val);
        }
        System.out.println("]");
    }
}