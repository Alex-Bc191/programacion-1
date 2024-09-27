package prog_java;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el precio del artículo
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();

        // Solicitar la cantidad que lleva el cliente
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Calcular el total a abonar
        double total = precio * cantidad;

        // Mostrar el resultado
        System.out.printf("El total a abonar es: %.2f\n", total);

        // Cerrar el escáner
        scanner.close();
    }
}
