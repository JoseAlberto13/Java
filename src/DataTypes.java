public class DataTypes {
    public static void main(String[] args) {

        // Tipos de datos "Primitivos"

        int myIntNumber = 27;
        System.out.println(myIntNumber);

        double myDouble = 22222.2222;
        System.out.println(myDouble);

        float myFloat = 334; // No funciona igual que en C
        System.out.println(myFloat);

        // long, byte. son otros datos primitivos

        char myChar = 'c'; // Para caracteres unicos, se deben usar comillas simples
        System.out.println(myChar);

        boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        String myString = "Hola, Java... Este no se puede considerar como tal, pero bue";
        System.out.println(myString);


        // Tipo de dato en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());

    }
}
