import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {

        // Funciones

        for (int index = 0; index < 5; index++) {
            sendEmail();
        }

        // ...

        sendEmail();

        sendEmailToUser("josealberto@gmail.com");
        sendEmailToUser("josealberto@gmail.com", "José");

        var users = new ArrayList<>(Arrays.asList("josealberto@gmail.com", "carlosjose@gmail.com"));
        sendEmailToUser(users);

        var state = sendEmailWithState("josealberto@gmail.com");
        System.out.println(state);

        System.out.println(sendEmailWithState(""));
    }

    // Función sin parámetros ni retorno
    public static void sendEmail() {
        System.out.println("Se envía el email");
    }

    // Función con parámetros
    public static void sendEmailToUser(String email) {
        System.out.println("Se envía el email a " + email);
    }

    // Sobrecarga de funciones
    public static void sendEmailToUser(String email, String name) {
        System.out.println("Se envía el email a " + name + " (" + email + ")");
    }

    public static void sendEmailToUser(ArrayList<String> emails) {
        for (String email: emails) {
            sendEmailToUser(email);
        }
    }


    // Función con retorno
    public static boolean sendEmailWithState(String email) {

        if (email.isEmpty()) {
            return false;
        }

        System.out.println("Se envía el email a " + email);
        return true;
    }
}