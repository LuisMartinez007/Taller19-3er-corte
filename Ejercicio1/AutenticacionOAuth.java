package Taller19.Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación OAuth (por ejemplo, verificar contra un servicio OAuth)
        if ("usuarioOAuth".equals(usuario) && "contraseñaOAuth".equals(contraseña)) {
            return true;
        }
        return false;
    }
}

