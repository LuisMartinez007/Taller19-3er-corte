package Taller19.Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String contraseña) {
        // Lógica de autenticación local (por ejemplo, verificar contra una base de datos local)
        if ("usuarioLocal".equals(usuario) && "contraseñaLocal".equals(contraseña)) {
            return true;
        }
        return false;
    }
}

