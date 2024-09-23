import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*Proporcionar numero 1*/
        System.out.print("Proporciona el numero1: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();
        /*Proporcionar numero 2*/
        System.out.print("Proporciona el numero2: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine();

        int numeroMayor = numero1 > numero2 ? numero1 : numero2;

        System.out.println("------------------------------------------------");
        System.out.println("El numero mayor es: " + numeroMayor);
        System.out.println("------------------------------------------------");
    }
}