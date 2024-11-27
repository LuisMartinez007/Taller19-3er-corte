package Taller19.Ejercicio2;

public class Prueba {
    public static void main(String[] args) {
        // Usar almacenamiento local
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardar("archivoLocal.txt", "Contenido del archivo local");
        System.out.println("Recuperar archivo local: " + gestorLocal.recuperar("archivoLocal.txt"));

        // Usar almacenamiento en la nube
        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardar("archivoNube.txt", "Contenido del archivo en la nube");
        System.out.println("Recuperar archivo en la nube: " + gestorNube.recuperar("archivoNube.txt"));
    }
}
