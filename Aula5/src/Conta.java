public class Conta {

    private static int qtdClientes;
    private double saldo=0;

    public Cliente cliente;

    public static int getQtdClientes() {
        return qtdClientes;
    }

    public static void setQtdClientes(int qtdClientes) {
        Conta.qtdClientes = qtdClientes;
    }

    void deposita(double valor){
        this.saldo = this.saldo + valor;
    }
    void saca(double valor){
        if(this.saldo<=valor){
            System.out.println("Não é possivel sacar");
        }
        else {
            this.saldo = this.saldo - valor;
        }
    }
    void extrato(){
        System.out.println(this.saldo);
    }

}
