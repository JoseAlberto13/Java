public class BeginnerExercises {

    public static void main(String[] args) {

        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String myName = "José Alberto";
        System.out.println(myName);

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int myAge = 27;
        System.out.println(myAge);

        // 3. Crea una variable double con tu altura en metros.
        double myHeight = 1.70;
        System.out.println(myHeight);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean doYouLikeProgramming = true;
        System.out.println(doYouLikeProgramming);

        // 5. Declara una constante con tu email.
        final String MY_EMAIL = "josearies.9811@gmail.com";
        System.out.println(MY_EMAIL);

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInitial = 'J';
        System.out.println(myInitial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        var myLocation = "Coronel";
        System.out.println(myLocation);
        myLocation = "Cerro Obligado";
        System.out.println(myLocation);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 27, b = 24;
        System.out.println( a + b );

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(myLocation.getClass().getSimpleName() + " " +MY_EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        String letters;
        int integers;

        letters = "Go Crazy - Chris Brown";
        System.out.println(letters);

    }
}
