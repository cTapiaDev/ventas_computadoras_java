package ventaspc;

import modelo.Monitor;
import modelo.Raton;
import modelo.Teclado;
import modelo.Computadora;
import servicio.Orden;

public class Main {
    
    public static void main(String[] args) {
        
        // Crear objetos
        Raton ratonDell = new Raton("usb", "Dell");
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Monitor monitorDell = new Monitor("Dell", 27);
        
        Raton ratonLenovo = new Raton("bluetooth", "Lenovo");
        Teclado tecladoLenovo = new Teclado("bluetooth", "Lenovo");
        Monitor monitorLenovo = new Monitor("Lenovo", 16);
        
        Computadora computadoraDell = 
                new Computadora(
                        "Computadora Dell", 
                        monitorDell, 
                        tecladoDell, 
                        ratonDell
                );
        
        Computadora computadoraLenovo =
                new Computadora(
                        "Computadora Lenovo",
                        monitorLenovo,
                        tecladoLenovo,
                        ratonLenovo
                );
        
        // Crear una instancia de la orden de los productos
        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraLenovo);
        
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraDell);
        orden2.mostrarOrden();
        
        
        
    }
}
