
public class Ej05_PrediccionSalida {

    static void mostrar(int numero) {
        System.out.println("Entero: " + numero);
    }

    static void mostrar(double numero) {
        System.out.println("Decimal: " + numero);
    }

    static void mostrar(String texto) {
        System.out.println("Texto: " + texto);
    }

    public static void main(String[] args) {

        // Prediccion de salida:
        // Entero: 2
        // Decimal: 3.3
        // Texto: Aqui valio 

        mostrar(2);
        mostrar(3.3);
        mostrar("Valio");
    }
}
// En este ejercicio hago tres llamadas con diferentes datos.
// Primero escribo lo que creo que va a salir
// y despues ejecuto el programa para ver si estaba bien.