import java.util.Arrays;
import java.util.List;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int ageUser = 17;

        if (ageUser >= 18) {
            System.out.println("El usuario puede votar");
        } else {
            System.out.println("El usuario es menor de edad, no puede votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        int a = 7, b = 3;

        if (a == b) {
            System.out.println(a + " es igual que " + b);
        } else if (a > b) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(b + " es mayor que " + a);
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        if (b > 0) {
            System.out.println("El número es positivo");
        } else if (b < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0, es un número neutro");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        a = 8;
        if (a % 2 == 0) {
            System.out.println("El número es Par >>> " + a);
        } else {
            System.out.println("El número es Impar >>> " + a);
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        if (a >= 1 && a <= 100) {
            System.out.println("El número esta dentro del rango " + a);
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        int day = 6;
        switch (day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No esta dentro del rango");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        double score = 90;
        if (score > 85) {
            System.out.println("Sobresaliente");
        } else if (score >= 50) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Suspenso");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        ageUser = 14;
        if (ageUser < 15) {
            System.out.println("El usuario solo puede entrar al cine acompañado");
        } else {
            System.out.println("Entrada libre");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        String vowels = "aeiou";
        String letter = "i";

        if (vowels.contains(letter)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }

        // Opción 2: Crear la lista de una manera más concisa. Se necesitó importar dos librerias
        List<String> vowelsList2 = Arrays.asList("a", "e", "i", "o", "u");

        if (vowelsList2.contains(letter)) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("Es una consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        a = 3;
        b = 8;
        int c = 16;

        if (a > b && a > c) {
            System.out.println("'a' es el mayor");
        } else if (b > a && b > c) {
            System.out.println("'b' es el mayor");
        } else {
            System.out.println("'c' es el mayor");
        }

    }
}