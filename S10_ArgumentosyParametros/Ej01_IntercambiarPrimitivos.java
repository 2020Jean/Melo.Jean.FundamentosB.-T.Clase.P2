public class Ej01_IntercambiarPrimitivos {

    static void intercarmbiar(int a, int b){
        int variable = a;
        a=b;
        b = variable;

        System.out.println("ingrese a:  "+ a);
        System.out.println("ingrese b:  "+ b);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 4;

        intercarmbiar(a,b);

        System.out.println(" intercambio:  ");
        System.out.println(" A: " + a);
        System.out.println(" B: " + b);


    }
}
// En este ejercicio intento cambiar los valores de a y b.
// Para eso guardo uno en otra variable y hago el intercambio.
// Al final muestro los valores para ver si cambiaron.