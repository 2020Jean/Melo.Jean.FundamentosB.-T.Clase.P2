
public class S11Ej04_ReescribirSinStatic {

 
    int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static void main(String[] args) {

        S11Ej04_ReescribirSinStatic ejercicio = new S11Ej04_ReescribirSinStatic();

        int a = 60;
        int b = 7;

        int resultado = ejercicio.sumar(a, b);

        System.out.println("Resultado: " + resultado);
    }

    // En este ejercicio cambie la forma de hacer la suma.
    // Antes utilizaba variables static y ahora paso
    // los numeros directamente al metodo.
    // Despues regreso el resultado con return.
}
