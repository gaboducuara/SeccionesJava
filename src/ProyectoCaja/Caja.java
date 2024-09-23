package ProyectoCaja;

import java.util.Scanner;

public class Caja {
    private int ancho;
    private int alto;
    private int profundo;

    // Constructor vacío
    public Caja() {}

    // Constructor con 3 argumentos
    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    // Método para calcular el volumen de la caja
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }

    // Método para imprimir el volumen de la caja
    public void imprimirVolumen() {
        System.out.println("\n------------------------");
        System.out.println("  Resultado del cálculo  ");
        System.out.println("------------------------");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Profundo: " + profundo);
        System.out.println("Volumen: " + calcularVolumen());
        System.out.println("------------------------\n");
    }
}