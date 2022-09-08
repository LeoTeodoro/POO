import java.util.Scanner;

public class PokemonElementals {
    
    public static void main(String[] args) {

        Scanner elemento = new Scanner(System.in);

        System.out.print("Entre com o elemental do seu pokemon: ");

        switch (elemento.nextLine())
        {
            case "fogo":
                System.out.println("Água");
                break;
            case "agua":
                System.out.println("Eletricidade");
                break;
            case "eletricidade":
                System.out.println("Pedra");
                break;
            case "pedra":
                System.out.println("Gelo");
                break;
            case "gelo":
                System.out.println("Fogo");
                break;
            case "planta":
                System.out.println("Fogo");
                break;
            default:
                System.out.println("Elemental desconhecido");

        }
    }
}
