public class Principal {
    public static void main(String[] args) {
        Quarto[] quartos = new Quarto[2];

        quartos[0] = new Quarto();
        quartos[1] = new Quarto();

        quartos[0].setNumeroDePortas(2);
        quartos[1].setNumeroDePortas(1);

        Casa casa = new Casa("Quito Carneiro, 201", "Amarela e vermelha", quartos);

        casa.mostraInfo();
    }
}
