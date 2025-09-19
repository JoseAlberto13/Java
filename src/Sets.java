import java.util.HashSet;

public class Sets {

    public static void main(String[] args) {

        // Declaración y creación
        HashSet<String> namesSet = new HashSet<>();
        var numbersSet = new HashSet<Integer>();

        // Tamaño
        System.out.println(namesSet.size());
        System.out.println(numbersSet.size());

        // Añadir elementos
        namesSet.add("José");
        namesSet.add("Carlos");
        namesSet.add("Alberto");
        namesSet.add("Mario");
        namesSet.add("Albertico");

        numbersSet.add(4);
        numbersSet.add(1);
        numbersSet.add(3);
        numbersSet.add(7);

        // Acceder a los elementos
        System.out.println(namesSet);
        System.out.println(namesSet.size());
        System.out.println(numbersSet);

        // Eliminar elementos

        namesSet.remove("Albertico");
        System.out.println(namesSet);

        // Buscar elementos
        System.out.println(namesSet.contains("José"));
        System.out.println(namesSet.contains("Albert"));

        // Conjuntos
        var countries = new HashSet<String>();
        countries.add("Venezuela");
        countries.add("Chile");
        countries.add("México");
        countries.add("Colombia");
        countries.add("España");

        namesSet.addAll(countries);
        System.out.println(namesSet);

//        namesSet.removeAll(countries); // Elimina los elementos de la colección indicada
//        System.out.println(namesSet);

        namesSet.retainAll(countries); // Solo conserva los elementos común con la colección indicada
        System.out.println(namesSet);

        //namesSet.addAll(numbersSet); Error >>>>>>> No es posible realizar esta operación.
    }
}
