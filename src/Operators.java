public class Operators {

    public static void main(String[] args) {

        // Operadores Aritméticos
        float a = 10;
        var b = 3;
        System.out.println("Operadores Aritméticos");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Operadores de Asignación
        System.out.println("Operadores de Asignación");
        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1;
        System.out.println(a);

        a *= 3;
        System.out.println(a);

        a /= 2;
        System.out.println(a);

        // Operadores de Comparación (Relacionales)
        System.out.println("Operadores de Comparación");

        System.out.println(a == b);
        System.out.println(a == 10.5);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Operadores Lógicos ( Lógica Proporcional )

        // AND
        System.out.println("Operadores Lógicos");
        System.out.println(true && true);
        System.out.println(false && false);
        System.out.println(false && true);
        System.out.println(true && false);

        System.out.println(3 > 2 && 2 > 13);

        // OR
        System.out.println(true || true);
        System.out.println(false || false);
        System.out.println(false || true);
        System.out.println(true || false);

        System.out.println(3 > 2 || 2 > 13);

        // NOT
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 2 > 13);

        // Operadores Unarios
        System.out.println("Operadores Unarios");
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b); // Aumenta y después imprime
        System.out.println(b++); // Primero lo imprime y después lo aumenta
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);

    }

}
