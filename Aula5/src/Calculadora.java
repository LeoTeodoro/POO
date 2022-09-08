public class Calculadora {

    static double pi = 3.14;

    static double circunferencia(double raio){
        double res;

        res = 2 * pi * raio;

        return res;
    }

    static double volume(double raio){
        double res;

        res = (4*pi*Math.pow(raio, 3)/3);

        return res;
    }

}
