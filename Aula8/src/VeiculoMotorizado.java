public class VeiculoMotorizado {
    private int potencia;
    private String cor;
    private int velocidadeAtual;

    VeiculoMotorizado(int potencia, String cor, int velocidadeAtual){
        this.potencia = potencia;
        this.cor = cor;
        this.velocidadeAtual = velocidadeAtual;
    }


    public void acelerar(){
        velocidadeAtual += 10;
        System.out.println(velocidadeAtual);
    }
}
