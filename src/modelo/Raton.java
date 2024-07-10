package modelo;

public class Raton extends DispositivoEntrada {
    
    private final int idRaton;
    private static int contadorRatones;
    
    // Constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        idRaton = ++contadorRatones; //Los "++" van delante, 
        //para sumar un 1 cada vez que se instancie un nuevo objeto raton
        // Cuando van primero, se aumenta el numero antes de almacenar la variable.
    }

    @Override
    public String toString() {
        return "Raton{" 
                + "idRaton=" + idRaton 
                + "} " + super.toString();
    }
    
    
    
}
