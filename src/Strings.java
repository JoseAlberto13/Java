import java.util.Locale;

public class Strings {

    public static void main(String[] args) {

        // Cadenas de texto

        String name = "José";
        var name2 = "José";

        var lastName = new String("Figueroa");

        // Concatenación
        System.out.println(lastName + " " + name );

        // Longitud
        System.out.println(name.length());

        // Obtener caracter
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));

        // Subcadena
        // Del apellido solo obtiene los caracteres indicados, desde el índice 2 hasta el 7.
        System.out.println(lastName.substring(2,7));

        // Mayúsculas y minúsculas
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        // Comprobar si contiene
        System.out.println("Hola, JavA".contains("ava"));
        System.out.println("Hola, JavA".contains("AVA"));
        System.out.println("Hola, JavA".toUpperCase().contains("AVA"));

        // Comparación
        // En vez de usar "==" es mejor utilizar el metodo equals()
        System.out.println(name.equals("José"));

        // Compara textos ignorando las mayúsculas y minúsculas
        System.out.println(name.equalsIgnoreCase("josé"));

        // Trim & Replace
        System.out.println("   Hola, me llamo José   ".trim()); // Elimina los espacios al inicio y al final
        System.out.println("   Hola, me llamo José   ".replace(" ", "")); // Reemplaza los caracteres especificados
        System.out.println("   Hola, me llamo José   ".replace("o", "0"));

        // equals() vs ==
        var a = "José";
        var b = "José";
        var c = new String("José");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        // Format
        var language = "Java";
        System.out.println(String.format("Hola, %s. Bienvenido a %s.", name, language));
        language = "Python";
        name = "Alberto";
        System.out.printf("Hola, %s. Bienvenido a %s.%n", name, language);
    }

}
