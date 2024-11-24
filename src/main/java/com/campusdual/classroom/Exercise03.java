package com.campusdual.classroom;

public class Exercise03 {

    //Constantes para credenciales válidas
    private static final String VALID_USERNAME = "Sebas";
    private static final String VALID_PASSWORD = "sebas01";

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Hola. Bienvenido " y la cadena de textos que se le pasa por parámetro.
    /**
    *Genera un mensaje de bienvenida para un usuario válido.
    * @param name Nombre del usuario
    * @return Mensaje de bienvenida personalizado
    */
    public static String greetings(String name) {
        return "Hola. Bienvenido " + name;
    }

    // Esto es una funcion, ya que devuelve un valor
    // TODO ↓: Tiene que devolver el siguiente mensaje: "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " y la cadena de texto que se le pasa por parámetro
    /**
     *Genera un mensaje de error para un usuario inválido.
     * @param name Nombre del usuario válido
     * @return Mensaje de error personalizado
     */
    public static String error(String nombre) {
        return "Ups. No pudimos validar tus datos. Tu nombre de usuario no es " + nombre;
    }

    //Esto es un procedimiento, ya que no devuelve un valor
    // TODO ↓: Tiene que comprobar si el usuario que recibe por parámetro es "Sebas" y su contraseña es "sebas01". Si es correcto, que muestre el mensaje de la función greetings() y si no que muestre el mensaje de la función error()
    /**
     * Verifica si las credenciales ingresadas son correctas y muestra el mensaje correspondiente.
     *
     * @param user Nombre de usuario ingresado.
     * @param pass Contraseña ingresada.
     */
    public static void checkUser(String user, String pass) {
        if (isValidCredentials(user, pass)) {
            System.out.println(greetings(user));
        } else {
            System.out.println(error(VALID_USERNAME));
        }
    }

    /**
     * Comprueba si las credenciales ingresadas coinciden con las válidas
     *
     * @param user Nombre de usuario ingresado
     * @param pass Contraseña ingresada
     * @return true si las credenciales son válidas, false en caso contrario.
     */
    private static boolean isValidCredentials(String user, String pass) {
        return VALID_USERNAME.equals(user) && VALID_PASSWORD.equals(pass);
    }


    public static void main(String[] args) {
        checkUser("Sebas","sebas01");
        checkUser("Paco","paco01");
    }
}
