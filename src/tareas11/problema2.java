
package tareas11;
import java.util.Scanner;
public class problema2 {
    public static void main(String[] args) {
        //creando objeto de lectura
        Scanner lectura = new Scanner(System.in);
        //variables
        int filas = 4;
        int columnas = 4;
        double[][] compras = new double[filas][columnas];
        double totalCompras = 0;
        int cantidadElementos = filas * columnas;
        double promedioCompras;
        // proceso de datos
        System.out.println("Ingrese los montos de compra para cada posicion en la matriz 4x4:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Compra en [" + (i+1) + "][" + (j+1) + "]: ");
                compras[i][j] = lectura.nextDouble();
                totalCompras += compras[i][j];
            }
        }
        promedioCompras = totalCompras / cantidadElementos;

        System.out.println("Matriz de Compras:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(compras[i][j] + "\t");
            }
            System.out.println();
        }

        // salida de datos
        System.out.println("Total de compras: " + totalCompras);
        System.out.println("Promedio de compras: " + promedioCompras);
        

    }
}

 
