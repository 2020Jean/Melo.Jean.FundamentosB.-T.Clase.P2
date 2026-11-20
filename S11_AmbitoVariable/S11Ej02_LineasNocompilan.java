
public class S11Ej02_LineasNocompilan {

    static int numero = 10;

    public static void main(String[] args) {

        int a = 5;

        if (a > 2) {
            int b = 8;
            System.out.println(b);
        }

        System.out.println(a);
        System.out.println(numero);
    }

    // En este ejercicio revise las lineas que daban error.
    // Las deje comentadas para que el programa funcione.
    // Los errores pasan porque algunas variables
    // no existen o estan fuera de donde se pueden usar.
}
