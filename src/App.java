import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        
        // Leer las cuatro puntuaciones
        System.out.print("Ingrese la puntuación del juez 1: ");
        double puntuacion1 = scanner.nextDouble();
        
        System.out.print("Ingrese la puntuación del juez 2: ");
        double puntuacion2 = scanner.nextDouble();
        
        System.out.print("Ingrese la puntuación del juez 3: ");
        double puntuacion3 = scanner.nextDouble();
        
        System.out.print("Ingrese la puntuación del juez 4: ");
        double puntuacion4 = scanner.nextDouble();
        
        // Validar las puntuaciones
        if (!esPuntuacionValida(puntuacion1) || !esPuntuacionValida(puntuacion2) ||
            !esPuntuacionValida(puntuacion3) || !esPuntuacionValida(puntuacion4)) {
            System.out.println("Error: Una o más puntuaciones no son válidas.");
            return;
        }
        
        // Guardar las puntuaciones en un arreglo
        double[] puntuaciones = {puntuacion1, puntuacion2, puntuacion3, puntuacion4};
        
        // Ordenar las puntuaciones
        java.util.Arrays.sort(puntuaciones);
        
        // Calcular el promedio de las tres puntuaciones más altas
        double suma = puntuaciones[1] + puntuaciones[2] + puntuaciones[3];
        double promedio = suma / 3;
        
        // Mostrar el resultado
        System.out.printf("La puntuación promedio de las tres puntuaciones más altas es: %.2f%n", promedio);
    }
    
    // Método para validar las puntuaciones
    public static boolean esPuntuacionValida(double puntuacion) {
        return puntuacion >= 0 && puntuacion <= 10;
    }
}
