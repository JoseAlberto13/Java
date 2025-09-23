import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {

        // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
        greet();

        // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
        greet("José");

        // 3. Haz un metodo que reciba dos números enteros y devuelva su resta.
        rest(7,-2);

        // 4. Crea un metodo que calcule el cuadrado de un número (n * n).
        square(11);

        // 5. Escribe una función que reciba un número y diga si es par o impar.
        evenOdd(7);

        // 6. Crea un metodo que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
        System.out.println(olderAger(1));

        // 7. Implementa una función que reciba una cadena y retorne su longitud.
        String myString = "Hello";
        System.out.println(countC(myString));

        //  8. Crea un metodo que reciba un array de enteros, calcula su media y lo retorna.
        int[] number = {7, 4, 7, 3, 2, 7, 7};
        System.out.println(Arrays.stream(number).average());
        System.out.println(averageArrayInt(number));

        // 9. Escribe un metodo que reciba un número y retorna su factorial.
        System.out.println(factorial(5));

        // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
        var myArrayList = new ArrayList<String>();
        myArrayList.add("Epa");
        myArrayList.add("Que");
        myArrayList.add("Pasa");
        myArrayList.add("Aquí");
        myArrayList.add("?");

        goOverArrayList(myArrayList);

    }

    public static void greet() {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // Sobrecarga de funciones. Podemos usar la misma función antes definida para pasarle parámetros.
    public static void greet(String name) {
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero! Mr. " + name );
    }

    public static void rest(double number1, double number2){
        System.out.println(number1-number2);
    }

    public static void square(double number) {
        System.out.println(number * number);
    }

    public static void evenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("El número es Par " + number);
        } else {
            System.out.println("El número es Impar " + number);
        }
    }

    public static boolean olderAger(int age) {
        return age >= 18;
    }

    public static int countC(String str){
        return str.length();
    }

    public static double averageArrayInt(int[] Array) {
        int contador = 0;
        double sum = 0;
        for (int number: Array) {
            contador++;
            sum += number;
        }
        return sum/contador;
    }

    public static double factorial(double number) {
        if (number == 0) {
            return 1;
        }
        return number * factorial(number -1);
    }

    public static void goOverArrayList(ArrayList<String> array) {
        for (String element: array) {
            System.out.println(element);
        }
    }

}

