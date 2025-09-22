import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercises {

    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        var list = new ArrayList<Integer>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        i = 0;
        do {
            System.out.println(list.get(i));
            i++;
        } while ( i < list.size() );

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int j = 1; j <= 50; j++) {
            if (j % 5 == 0) {
                System.out.println(j);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        int total = 0;
        for (Integer number: list) {
            total += number;
        }
        System.out.println(total);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        int[] array = {10, 20, 30, 40, 50};
        for (int x = 0; x < array.length; x++) {
            System.out.println(array[x]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        var set = new HashSet<String>();
        set.add("Uno");
        set.add("Dos");
        set.add("Cuatro");
        set.add("Tres");

        for (String element: set) {
            System.out.println(element);
        }

        var map = new HashMap<Integer, String>();
        map.put(1, "Uno");
        map.put(2, "Dos");
        map.put(3, "Tres");
        map.put(4, "Cuatro");

        for (Map.Entry<Integer, String> element: map.entrySet()) {
            System.out.println(element);
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int j = 10; j > 0; j--) {
            System.out.println(j);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int j = 0; j <= 20; j++) {
            if (j % 3 == 0) {
                continue;
            }
            System.out.println(j);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        int[] array2 = {10, 20, 30, 40, 50, -60, 70, 80, 90, 100};

        for (int number: array2) {
            if (number < 0) {
                break;
            }
            System.out.println(number);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int factorial = 7;
        total = factorial;
        for (int j = factorial-1; j > 0; j--) {
            System.out.println(j);
            total *= j;
        }
        System.out.println(total);
    }
}
