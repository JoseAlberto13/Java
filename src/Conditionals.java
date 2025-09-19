public class Conditionals {

    public static void main(String[] args) {

        // Condicionales
        String name = "José";
        int age = 27;

        if (age > 18){
            System.out.println("El usuario es mayor de edad");
        }
        else if (age == 18) {
            System.out.println("El usuario aca de cumplir la mayoría de edad");
        }
        else {
            System.out.println("El usuarios es menor de edad");
        }

        // Switch

        int day = (int) (Math.random() * 7 + 1); // Crea un número del 1 al 7 de manera aleatoria

        switch (day) {
            case 1:
                System.out.println("Lunes "+ day);
                break;
            case 2:
                System.out.println("Martes "+ day);
                break;
            case 3:
                System.out.println("Miércoles "+ day);
                break;
            case 4:
                System.out.println("Jueves "+ day);
                break;
            case 5:
                System.out.println("Viernes "+ day);
                break;
            case 6:
                System.out.println("Sábado "+ day);
                break;
            case 7:
                System.out.println("Domingo "+ day);
                break;
            default:
                System.out.println("Día no encontrado");
        }

    }
}
