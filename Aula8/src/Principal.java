public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro(100, "Branco", 70, 4);
        carro.acelerar();

        Moto moto = new Moto(50, "Vermelha", 60, 250);
        moto.empinar();

        Bicicleta bicicleta = new Bicicleta(8);
        bicicleta.empinar();

    }
}
