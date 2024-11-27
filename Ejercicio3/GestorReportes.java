package Taller19.Ejercicio3;

public class GestorReportes {
    private GeneradorReporte generadorReporte;

    // Constructor
    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    // Método para generar un reporte
    public void generar(String contenido) {
        generadorReporte.generarReporte(contenido);
    }
}
