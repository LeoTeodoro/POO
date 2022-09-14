public class Pepperoni extends Pizza{
    @Override
    public void mostraIngredientes() {
        System.out.println("Mussarela, Pepperoni");
    }

    @Override
    public String mostraBrinde() {
        String brinde = "chaveiro";

        return brinde;
    }
}
