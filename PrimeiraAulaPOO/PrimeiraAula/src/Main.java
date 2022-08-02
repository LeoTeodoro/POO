import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        String nome;
        long cpf;
        int idade;
        boolean tittle;

        System.out.print("Insira seu nome: ");
        nome = scann.nextLine();
        System.out.print("Insira sua idade: ");
        idade = scann.nextInt();
        System.out.print("Insira seu cpf: ");
        cpf = scann.nextLong();
        System.out.print("Você tem titulo de eleitor: true=sim false=não ");
        tittle = scann.nextBoolean();

        if (idade >= 18 && tittle == true) {
            System.out.println("Nome: "+ nome);
            System.out.println("Essa pessoa está apta a votar");
        }
        else {
            System.out.println("Nome: "+ nome);
            System.out.println("Essa pessoa não está apta a votar");
        }
    }
}