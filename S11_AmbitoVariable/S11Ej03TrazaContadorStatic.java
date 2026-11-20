
public class S11Ej03TrazaContadorStatic {

    static int contador = 0;

    static void contar() {
        contador++;
        System.out.println("Contador: " + contador);
    }

    public static void main(String[] args) {

        contar();
        contar();
        contar();
    }

    // En este ejercicio hice un contador que aumenta
    // cada vez que llamo al metodo.
    // Como la variable es static, mantiene su valor
    // y no comienza desde cero en cada llamada.

   
}
