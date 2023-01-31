public class Principal {
    public static void main(String[] args) {
        Moeda moeda1 = new Moeda(5.5f);
        Moeda moeda2 = new Moeda(1.0f);
        Moeda moeda3 = new Moeda(2.3f);

        Cofrinho cofrinho = new Cofrinho();

        cofrinho.addMoeda(moeda1);
        cofrinho.addMoeda(moeda2);
        cofrinho.addMoeda(moeda3);

        System.out.println(cofrinho.getQuantMoedas());

        System.out.println(cofrinho.getValorTotal());

        System.out.println(cofrinho.getMoedaMaiorValor());

        cofrinho.ordenaMoedas();
    }
}
