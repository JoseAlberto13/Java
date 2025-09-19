import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // Declaración y Creación
        ArrayList<String> namesList = new ArrayList<>();
        var numbersList = new ArrayList<Integer>();

        // Tamaño
        System.out.println(namesList.size());
        System.out.println(numbersList.size());

        // Añadir elementos

        namesList.add("José");
        namesList.add("Carlos");
        namesList.add("Alberto");
        namesList.add("Mario");

        System.out.println(namesList.size());

        // Acceder a los elementos
        System.out.println(namesList.getFirst());
        System.out.println(namesList.getLast());
        System.out.println(namesList.get(2));

        // Modificar elementos
        namesList.set(2, "Albertico");
        System.out.println(namesList.get(2));

        // Eliminar elementos
        namesList.remove(2);
        System.out.println(namesList.get(2));
        System.out.println(namesList.size());

        // Buscar elementos
        System.out.println(namesList.contains("José"));
        System.out.println(namesList.contains("CARLOS"));

        // Limpiar ArrayList
        System.out.println(namesList);
        namesList.clear();
        System.out.println(namesList.size());
        System.out.println(namesList);

    }
}
