import java.util.Arrays;

public class Ej02_IntercambioArreglo {

    static void intercambiar(int [] v, int i, int j){
        int guardar = v [j];
        v[j] = v [i];
        v[i] = guardar;

        System.out.println("ingrese numero:  "+  v[0]);
    }

    public static void main(String[] args) {
        int [] v = {1, 2, 3, 4};

        intercambiar(v, 5, 7);

        System.out.println(" arreglo es : "+ Arrays.toString(v));
    }
    
}
// En este ejercicio tengo un arreglo con varios numeros.
// La idea es cambiar de lugar dos numeros del arreglo,
// usando otra variable para guardar uno de ellos.
// Despues muestro como quedo el arreglo.