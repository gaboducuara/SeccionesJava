import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /*Escribe el alto*/
        
        System.out.print("Proporciona el alto: ");
        int alto = scanner.nextInt();
        scanner.nextLine(); 

        
        /*Escribe el ancho*/
        System.out.print("Proporciona el ancho: ");
        int ancho = scanner.nextInt();
        scanner.nextLine(); 

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;
    
        
        /*retorno en consola*/
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.printf("Rectangulo con alto %d y ancho %d:%n", alto, ancho);
        System.out.printf("Area: %d%n", area);
        System.out.printf("Perimetro: %d%n", perimetro);
        System.out.println("------------------------------------------------");
        
    }
}