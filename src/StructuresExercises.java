import java.io.FilterOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class StructuresExercises {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] array5Valores = {1,2,3,4,5};
        System.out.println(array5Valores.getClass().getSimpleName());
        System.out.println(array5Valores.length);
        System.out.println(Arrays.toString(array5Valores));

        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(array5Valores[4]);
        array5Valores[4] = 0;
        System.out.println(array5Valores[4]);
        System.out.println(Arrays.toString(array5Valores));

        // 3. Crea un ArrayList vacío.
        var arrayEmpty = new ArrayList<Integer>();
        System.out.println(arrayEmpty);

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        arrayEmpty.add(1);
        arrayEmpty.add(3);
        arrayEmpty.add(5);
        arrayEmpty.add(7);
        System.out.println(arrayEmpty);
        arrayEmpty.remove(3);
        System.out.println(arrayEmpty);

        // 5. Crea un HashSet con 2 valores diferentes.
        var theNewSet = new HashSet<String>();
        theNewSet.add("José");
        theNewSet.add("Alberto");
        System.out.println(theNewSet);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        theNewSet.add("José");
        theNewSet.add("Carlos");
        System.out.println(theNewSet);

        // 7. Elimina uno de los elementos del HashSet.
        theNewSet.remove("Carlos");
        System.out.println(theNewSet);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        var theMap = new HashMap<String, String>();
        theMap.put("José", "+56 9 54851591");
        theMap.put("Alberto", "+56 9 74851538");
        theMap.put("Carlos", "+56 9 42841521");
        System.out.println(theMap);

        // 9. Modifica uno de los contactos y elimina otro.
        theMap.replace("José", "+56 9 54842549");
        theMap.remove("Carlos");
        System.out.println(theMap);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.
        String[] array = {"A", "B", "C", "A", "D"};
        System.out.println(Arrays.toString(array));

        // transfórmalo en un ArrayList
        var list = new ArrayList<String>(Arrays.asList(array));
        list.addFirst("Es Una Lista");
        System.out.println(list);

        // a continuación en un HashSet
        var set = new HashSet<String>(list);
        System.out.println(set);


        // finalmente en un HashMap con clave y valor iguales.
        var map = new HashMap<String, String>();

        for (String keyAndValue : set){
                map.put(keyAndValue, keyAndValue);
        }

        System.out.println(map);

    }

}
