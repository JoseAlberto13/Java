import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        // Declaración
        HashMap<Object, Object> legacyMap = new HashMap<>();
        var namesMaps = new HashMap<String, String>();

        // Inserción
        namesMaps.put("José", "Alberto");
        namesMaps.put("Carlos", "José");
        namesMaps.put("Carlos", "Alberto");
        namesMaps.put("Mario", "Enmanuel");

        System.out.println(namesMaps.size()); // Mostrará 3, ya que no se añadió un elemento. Por el hash de la clave "Carlos"
        System.out.println(namesMaps);

        // Acceder a los elementos
        System.out.println(namesMaps.get("Carlos"));
        System.out.println(namesMaps.get("Jose"));
        System.out.println(namesMaps.values());
        System.out.println(namesMaps.keySet());

        // Verificar elementos
        System.out.println(namesMaps.containsKey("José"));
        System.out.println(namesMaps.containsValue("Enmanuel"));

        // Eliminar elementos
        System.out.println(namesMaps.remove("Carlos"));
        System.out.println(namesMaps);

        // Modificar elementos
        namesMaps.replace("José", "Figueroa");

        // Limpiar HashMap
//        namesMaps.clear();
        System.out.println(namesMaps);
    }
}
