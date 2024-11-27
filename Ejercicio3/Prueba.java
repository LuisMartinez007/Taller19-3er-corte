package Taller19.Ejercicio3;

public class Prueba{
    public static void main(String[] args) {
        // Usar reporte PDF
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.generar("Contenido del reporte en PDF");

        // Usar reporte Excel
        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.generar("Contenido del reporte en Excel");
    }
}
