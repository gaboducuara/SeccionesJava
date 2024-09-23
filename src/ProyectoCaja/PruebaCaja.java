package ProyectoCaja;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ancho de la caja:");
        int ancho = scanner.nextInt();

        System.out.println("Ingrese el alto de la caja:");
        int alto = scanner.nextInt();

        System.out.println("Ingrese el profundo de la caja:");
        int profundo = scanner.nextInt();

        // Crear un objeto de tipo Caja con valores ingresados por el usuario
        Caja caja = new Caja(ancho, alto, profundo);

        // Imprimir el volumen de la caja
        caja.imprimirVolumen();
    }
}