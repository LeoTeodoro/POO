import java.util.Random;
import java.util.Scanner;

public class CanyouGuessTheNumber {
    public static void main(String[] args) {

        int numAleatorio;

        //Gerando um número aleatório
        Random randomGenerator = new Random();
        numAleatorio = randomGenerator.nextInt(10)+1;

        //Entrando com a primeira tentativa
        Scanner numIn = new Scanner(System.in);
        System.out.print("Entre com a sua tentativa: ");
        int tentativa = numIn.nextInt();

        //Enquanto a tentativa for diferente do número aleatório
        while (tentativa != numAleatorio){
            System.out.println("Número errado :X");

            //Fazendo a crítica dos dados
            if (tentativa < numAleatorio) {
                System.out.println("Tente um número maior");
            } else if (tentativa > numAleatorio) {
                System.out.println("Tente com um número menor");
            }
            System.out.print("Entre com a sua nova tentativa: ");
            tentativa = numIn.nextInt();
        }
        System.out.println("Parabéns você acertou!!! :)");
    }
}
