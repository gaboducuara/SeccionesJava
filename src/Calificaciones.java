import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("  Sistema de Calificaciones  ");
        System.out.println("=================================");
        System.out.print("Proporciona un valor entre 0 y 10: ");
        double calificacion = scanner.nextDouble();
        scanner.nextLine();

        String letra = obtenerLetra(calificacion);

        System.out.println("=================================");
        System.out.println("  Resultado  ");
        System.out.println("=================================");
        System.out.println("La calificacion es: " + letra);
        System.out.println("=================================");
    }

    public static String obtenerLetra(double calificacion) {
        if (calificacion >= 9 && calificacion <= 10) {
            return "A";
        } else if (calificacion >= 8 && calificacion < 9) {
            return "B";
        } else if (calificacion >= 7 && calificacion < 8) {
            return "C";
        } else if (calificacion >= 6 && calificacion < 7) {
            return "D";
        } else if (calificacion >= 0 && calificacion < 6) {
            return "F";
        } else {
            return "Valor desconocido";
        }
    }
}