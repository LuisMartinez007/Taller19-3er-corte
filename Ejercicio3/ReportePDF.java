package Taller19.Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        // Lógica para generar un reporte en formato PDF
        System.out.println("Generando reporte PDF con el siguiente contenido: " + contenido);
    }
}

