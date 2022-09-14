public class Supreme extends Pizza{
    @Override
    public void mostraIngredientes() {
        System.out.println("Leite condensado, morango");
    }

    @Override
    public String mostraBrinde()
    {
        String brinde = "carrinho";
        return brinde;
    }
}
