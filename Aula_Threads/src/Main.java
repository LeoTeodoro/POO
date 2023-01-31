public class Main {
    public static void main(String[] args) {
        Thread fatorial = new FatorialThreads(4);
        Thread segundos = new contaSegundos(10);
        Thread hexagono = new AreaHexagono(2);

        fatorial.start();
        segundos.start();
        hexagono.start();
    }
}
