import java.util.Scanner;

public class LibrosTienda {
    private String nombre;
    private int id;
    private double precio;
    private boolean envioGratuito;

    public LibrosTienda(String nombre, int id, double precio, boolean envioGratuito) {
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.envioGratuito = envioGratuito;
    }

    public void imprimirInformacion() {
         System.out.println("------------------------------------------------");
        System.out.printf("%s #%d%n", nombre, id);
        System.out.printf("Precio: $%.2f%n", precio);
        System.out.printf("Envio Gratuito: %b%n", envioGratuito);
        System.out.println("------------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                  /*Proporciona el nombre*/
        System.out.print("Proporciona el nombre: ");
        String nombre = scanner.nextLine();
                  
                  /*Proporciona el Id*/
        System.out.print("Proporciona el id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        
                  /*proporciona el precio*/
        System.out.print("Proporciona el precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

                  /*Envio gratuito*/
        System.out.print("Proporciona el envio gratuito (true/false): ");
        boolean envioGratuito = scanner.nextBoolean();
        scanner.nextLine();

        LibrosTienda libro = new LibrosTienda(nombre, id, precio, envioGratuito);
        System.out.println();
        libro.imprimirInformacion();
    }
}