package Taller19.Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    // Constructor
    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    // Método para autenticar usuarios
    public boolean autenticarUsuario(String usuario, String contraseña) {
        return servicioAutenticacion.autenticar(usuario, contraseña);
    }
}

