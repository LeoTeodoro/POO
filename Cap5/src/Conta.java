public class Conta {

    //ATRIBUTOS DA CONTA

    private int numero;
    private float saldo;
    private String proprietario;

    //ATRIBUTO DE CLASSE
    //ATRIBUTO QUE TODOS OS OBJETOS DESTA CLASSE PODEM ACESSAR
    static int totalContas;

    //CRIANDO UM CONSTRUTOR
    Conta(int n, float s, String proprietario){
        System.out.println("OBJETO CONTA SENDO CRIADO!!");
    }

    Conta(){
        System.out.println("CONSTRUTOR SIMPLES SENDO CRIADO!!!");
        totalContas++;
    }

    //MÉTODOS
    public void sacar(float valor){
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque realizado!");
            System.out.println("Novo saldo: "+ saldo+" R$");
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    }


}
