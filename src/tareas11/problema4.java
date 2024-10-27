
package tareas11;

import java.util.Random;

public class problema4 {
    public static void main(String[] args) {
        //variables
        int filas = 3;
        int columnas = 3;
        double[][] ventas = new double[filas][columnas];
        double promedioVentas;
        Random aleatoria = new Random();

        double totalVentas = 0;
        int cantidadElementos = filas * columnas;

        // proceso de datos
        System.out.println("Ventas registradas en la matriz 3x3:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                ventas[i][j] = 1000 + (9000) * aleatoria.nextDouble(); 
                System.out.printf("%.2f\t", ventas[i][j]);
                
                
                totalVentas += ventas[i][j];
            }
            System.out.println();
        }
        
        promedioVentas = totalVentas / cantidadElementos;

        // salida de datos
        System.out.println("Total de ventas: " + totalVentas);
        System.out.println("Promedio de ventas: " + promedioVentas);
    }
}

    

