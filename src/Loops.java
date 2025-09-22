import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Loops {

    public static void main(String[] args) {

        // Loops
        // ** for controlado por contador **
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, Java!");
        }

        String[] namesArray = {"José", "Alberto", "Carlos", "Mario"};

        for (int i = 0; i < namesArray.length; i++) {
            System.out.println(namesArray[i]);
        }

        // ** for-each ---> para cada uno de los elementos **
        for (String name: namesArray) {
            System.out.println("forEach >> " + name);
        }

        var numbersSet = new HashSet<Integer>();

        numbersSet.add(1);
        numbersSet.add(2);
        numbersSet.add(3);
        numbersSet.add(4);
        numbersSet.add(5);

        for (Integer number: numbersSet) {
            System.out.println(number);
        }

        var emailsMap = new HashMap<String, String>();

        emailsMap.put("José", "unemail@gmail.com");
        emailsMap.put("Junior", "otromail@gmail.com");
        emailsMap.put("Carlos", "algunmail@gmail.com");
        emailsMap.put("Elvira", "estemail@gmail.com");
        emailsMap.put("Veronica", "estemail@gmail.com");

        // Con los maps es necesario transformarlo a un set para poder iterar
        for (Map.Entry<String, String> email: emailsMap.entrySet()) {
            System.out.println("Usuario:" + email.getKey() + " Email:" + email.getValue());
        }

        // while
        int i = 0;
        while ( i < namesArray.length) {
            System.out.println(namesArray[i]);
            i++;
        }

        int x = 0;
        boolean find = false;
        while (!find) {
            System.out.println(namesArray[x]);
            if (namesArray[x].equals("Alberto")) {
                find = true;
            }
            x++;
        }

        // do-while
        i = 0;
        do {
            System.out.println("do-while");
            i++;
        } while (i < 5) ;

        // Control de bucles

        for (String name: namesArray) {
            if (name.equals("Alberto")) {
                break;
            }
            System.out.println("forEach con break >> " + name);
        }

        for (int j = 0; j <= 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println("for con continue " + j );
        }

    }
}
