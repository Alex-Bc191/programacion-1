package prog_java;

import java.util.Scanner;

public class PracticaMatematica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese cuatro números enteros
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingrese el cuarto número: ");
        int num4 = scanner.nextInt();

        // Realizar la suma de los dos primeros números
        int suma = num1 + num2;

        // Realizar el producto de los dos últimos números
        int producto = num3 * num4;

        // Mostrar los resultados
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("El producto de " + num3 + " y " + num4 + " es: " + producto);
        
        // Cerrar el escáner
        scanner.close();
    }
}
