
package tareas11;
import java.util.Scanner;
public class problema1 {
    public static void main(String[] args) {
        //creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //variables
        int filas = 4;
        int columnas = 4;
        double[][] ventas = new double[filas][columnas];
        double totalVentas = 0;

        //proceso de datos
        System.out.println("Ingrese las ventas para cada posicion en la matriz 4x4:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Venta en [" + (i+1) + "][" + (j+1) + "]: ");
                ventas[i][j] = lectura.nextDouble();
                totalVentas += ventas[i][j];
            }
        }

        
        System.out.println("Matriz de Ventas:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
            System.out.println();
        }

        //salida de datos
        System.out.println("Total de ventas:" + totalVentas);
        
    
    }
}

        
 
