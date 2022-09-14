public class Moto extends VeiculoMotorizado implements Manobras{

    private int cilindradas;

    Moto(int potencia, String cor, int velocidadeAtual, int cilindradas) {
        super(potencia, cor, velocidadeAtual);
        this.cilindradas = cilindradas;
    }

    @Override
    public void empinar() {
        System.out.println("Empinando a moto");
    }
}

