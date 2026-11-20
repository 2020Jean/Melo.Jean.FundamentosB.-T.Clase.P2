
public class S11Ej01_MarcarAmbitos {

    static int numero = 10; 

    public static void main(String[] args) {

        int a = 8; 
        int b = 2;

        if (a < b) {
            int suma = a + b; // de bloque
            System.out.println("Suma: " + suma);
        }

        System.out.println("Numero: " + numero);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }

    // En este ejercicio use diferentes variables.
    // Algunas estan dentro del main, otra dentro del if
    // y una esta fuera del main.
    // Asi puedo ver donde se puede utilizar cada una.
}
