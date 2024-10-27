
package tareas11;
import java.util.Random;
public class problema3 {
    public static void main(String[] args) {
        //variables
        int filas = 4;
        int columnas = 4;
        double[][] ventas = new double[filas][columnas];
        Random aleatoria = new Random();

        double ventaMayor = Double.MIN_VALUE;
        double ventaMenor = Double.MAX_VALUE;

        // proceso de datos
        System.out.println("Ventas registradas en la matriz 4x4:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                ventas[i][j] = 10 + (5000 - 10) * aleatoria.nextDouble(); 
                System.out.printf("%.2f\t", ventas[i][j]);

                
                if (ventas[i][j] > ventaMayor) {
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor) {
                    ventaMenor = ventas[i][j];
                }
            }
            System.out.println();
        }

        // salida de datos
        System.out.println("Venta mayor: " + ventaMayor);
        System.out.println("Venta menor: " + ventaMenor);
    }
}

    

