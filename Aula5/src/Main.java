import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        double raio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio: ");

        raio = sc.nextDouble();

        System.out.println(Calculadora.circunferencia(raio));

        System.out.println(Calculadora.volume(raio));
         */

        Conta conta = new Conta();

        Conta.setQtdClientes(2);
        System.out.println(Conta.getQtdClientes());

        Cliente cliente = new Cliente();

        conta.deposita(10.00);
        conta.saca(5.00);
        conta.extrato();

        conta.cliente = cliente;

        cliente.setNome("leo");

        cliente.setCpf(700578366);

        System.out.println(conta.cliente.getNome());

    }
}
