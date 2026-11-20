
public class Ej03_AplicarDescuento {


    static void aplicarDescuento(double[] precios, double pct) {
        for (int i = 0; i < precios.length; i++) {

            precios[i] = precios[i] - (precios[i] * pct / 100);

        }
    }

    public static void main(String[] args) {

        double[] precios = {4, 2, 15};
        double descuento = 15;

        System.out.println("Sin   descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }

        aplicarDescuento(precios, descuento);

        System.out.println("Con descuento:");

        for (int i = 0; i < precios.length; i++) {
            System.out.println(precios[i]);
        }
    }
}

// En este ejercicio puse varios precios y les aplique
// un descuento. Luego muestro cuanto costaban antes
// y cuanto cuestan ahora con el descuento.