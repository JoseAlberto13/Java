public class StringsExercises {
    public static void main(String[] args) {

        // 1. Concatena dos cadenas de texto.
        var saludo = "Hola, Bienvenido.";
        var invitado = "José";

        System.out.println(saludo + " " + invitado);

        // 2. Muestra la longitud de una cadena de texto.
        System.out.println("Longitud: " + invitado.length());

        // 3. Muestra el primer y último carácter de un string.
        System.out.println(invitado.charAt(invitado.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.
        System.out.println(invitado.toUpperCase());
        System.out.println(invitado.toLowerCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println(saludo.contains("Hola"));

        // 6. Formatea un string con un entero.
        int age = 27;
        System.out.printf("Mi nombre es %s y tengo %d años%n", invitado, age);

        // 7. Elimina los espacios en blanco al principio y final de un string.
        System.out.println("   Este es el mensaje con espacios   ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
        System.out.println("   Este es el mensaje con espacios   ".replace(" ", "-"));

        // 9. Comprueba si dos strings son iguales.
        System.out.println(invitado.equals("José"));

        // 10. Comprueba si dos strings tienen la misma longitud.
        System.out.println(invitado.length() == saludo.length());

    }
}
