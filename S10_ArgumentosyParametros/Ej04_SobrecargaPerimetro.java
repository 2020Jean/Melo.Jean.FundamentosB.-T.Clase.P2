
import java.util.Locale;

public class Ej04_SobrecargaPerimetro {

    static double area(double lado) {
        return lado * lado;
    }

    static double area(double base, double altura) {
        return base * altura;
    }

    static double area(double radio, boolean esCircular) {
        return Math.PI * radio * radio;
    }

    public static void main(String[] args) {

        double areaCuadrado = area(8);
        double areaRectangulo = area(9, 4);
        double areaCirculo = area(6, false);
        

        System.out.println("----------Resultado----------");
        System.out.println("area cuadrado: " + areaCuadrado);
        System.out.println("area rectangulo: " + areaRectangulo);
        System.out.println("area circulo: " + areaCirculo);
        

        Locale.setDefault(Locale.US);
    }
}
// En este ejercicio calculo el perimetro de un cuadrado
// y un rectangulo. Para eso utilizo sus medidas
// y al final muestro los resultados.