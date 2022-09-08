import java.util.Scanner;

public class GoRangers {
    public static void main(String[] args) {
        //Exercício rangers

        int ano1;
        int ano2;
        int ano3;

        //Número de vilões derrotados no ano 1
        System.out.printf("Digite o número de vilões derrotados no ano 1: ");
        Scanner viloes = new Scanner(System.in);

        ano1 = viloes.nextInt();

        //Número de vilões derrotados no ano 2
        System.out.printf("Digite o número de vilões derrotados no ano 2: ");
        ano2 = viloes.nextInt();

        //Número de vilões derrotados no ano 3
        System.out.printf("Digite o número de vilões derrotados no ano 3: ");
        ano3 = viloes.nextInt();

        System.out.printf("Apreensoes: "+"Ano 1: %d, Ano 2: %d, Ano 3: %d", ano1, ano2, ano3);
    }
}
