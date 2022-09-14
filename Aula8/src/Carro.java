public class Carro extends VeiculoMotorizado {
    private int numeroDePortas;

    Carro(int potencia, String cor, int velocidadeAtual, int numeroDePortas) {
        super(potencia, cor, velocidadeAtual);
        this.numeroDePortas = numeroDePortas;
    }


}
