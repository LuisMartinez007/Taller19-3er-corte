package Taller19.Ejercicio1;

public class Prueba{
    public static void main(String[] args) {
        // Crear instancia de AutenticacionLocal y GestorAutenticacion
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal);

        // Autenticar usuario local
        System.out.println("Autenticación Local: " + gestorLocal.autenticarUsuario("usuarioLocal", "contraseñaLocal"));

        // Crear instancia de AutenticacionOAuth y GestorAutenticacion
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth);

        // Autenticar usuario OAuth
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticarUsuario("usuarioOAuth", "contraseñaOAuth"));
    }
}

