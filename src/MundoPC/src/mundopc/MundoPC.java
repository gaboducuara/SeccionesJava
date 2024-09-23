package mundopc;

import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorAsus = new Monitor("Asus", 15);
        Teclado tecladoAsus = new Teclado("bluetooth", "Asus");
        Raton ratonAsus = new Raton("bluetooth", "Asus");
        Computadora computadoraAsus = new Computadora("Computadora Asus", monitorAsus, tecladoAsus, ratonAsus );
        
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer );
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraAsus);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
