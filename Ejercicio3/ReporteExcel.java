package Taller19.Ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generarReporte(String contenido) {
        // Lógica para generar un reporte en formato Excel
        System.out.println("Generando reporte Excel con el siguiente contenido: " + contenido);
    }
}
