public abstract class Unidade{

    Pizza[] pizzas = new Pizza[20];
    protected String endereco;
    protected String nomeResponsavel;

    public void mostraPizzas(){

        for (Pizza p: pizzas){
            if (p != null) {
                System.out.println();
            }
        }
    }
}
