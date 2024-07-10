package servicio;

import java.util.List;
import java.util.ArrayList;
import modelo.Computadora;

public class Orden {
    
    private final int idOrden;
    private final List<Computadora> computadoras;
    private static int contadorOrdenes;
    
    // Constructor
    public Orden() {
        computadoras = new ArrayList<>();
        idOrden = ++contadorOrdenes;
    }
    
    public void agregarComputadora(Computadora computadora) {
        computadoras.add(computadora);
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #" + idOrden);
        System.out.println("Total de computadoras: " + computadoras.size());
        computadoras.forEach(System.out::println);
//        for (Computadora e : computadoras) {
//            System.out.println(e);
//        }
    }
    
    
    
    
    
    
    
}
