public class Arrays {

    public static void main(String[] args) {

        // Declaración y creación
        int[] numbersArray = new int[3]; // Solo estamos definiendo el tamaño del array

        System.out.println(numbersArray.length);

        String[] namesArray = {"José", "Alberto", "Carlos", "Mario"};

        // Acceso por índices
        System.out.println(numbersArray[1]);
        System.out.println(namesArray[1]);


        // Modificación
        numbersArray[0] = 7;
        numbersArray[1] = 4;
        System.out.println(numbersArray[0]);

        namesArray[1] = "Albertico";
        System.out.println(namesArray[1]);

    }
}
