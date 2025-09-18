public class HelloWorldExercises {
    public static void main(String[] args){
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".
        System.out.println("Mi Nombre es: José Alberto Figueroa Lucena");

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.
        System.out.println("Hola\nMundo");

        // 3. Añade un comentario sobre lo que hace cada línea del programa.
        // Las primeras líneas hacen una simple impresión de texto

        // 4. Crea un comentario en varias líneas.
        /*
        Este es
        El Comentario
        MultiLineas
        */

        // 5. Imprime tu edad, tu color favorito y tu ciudad.
        int edad = 27;
        String colorFavorito = "Azul";
        String ciudad = "Coronel";
        System.out.print(edad + " " + colorFavorito + " " + ciudad);

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".
        System.out.printf("%n %s %d %s %s %s %s %n",
                "Mi Edad: ", edad,
                "Mi Color Fav: ", colorFavorito,
                "Mi Ciudad:", ciudad);

        // 7. Utiliza varios println para imprimir una frase.
        IO.print("Comenzando");
        IO.print(" a programar en ");
        IO.print("Java.");
        IO.print(" Para convertirme en");
        IO.print(" un desarrollador excepcional ;D");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).
        // Se me complicó, no quise leer más y solo copie y pegue de StackOverflow, Dice que es UniCode
        System.out.println("ž".codePointAt(0)); // encuentra el punto de código es 382
        System.out.println((char) 382); // genera ž en la consola intellij con codificación utf-8

        // 9. Intenta ejecutar el programa sin el método main y observa el error.
        // Ni siquiera deja ejecutar.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
        // No compila el programa, ya que la clase debe tener el mismo nombre que el archivo.
    }
}
