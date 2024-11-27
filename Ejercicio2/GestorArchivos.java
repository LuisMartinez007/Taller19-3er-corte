package Taller19.Ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    // Constructor
    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    // Métodos para guardar y recuperar archivos
    public void guardar(String nombreArchivo, String contenido) {
        almacenamiento.guardarArchivo(nombreArchivo, contenido);
    }

    public String recuperar(String nombreArchivo) {
        return almacenamiento.recuperarArchivo(nombreArchivo);
    }
}

