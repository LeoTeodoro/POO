public class CarrinhoDeCompras {
    private String loginCliente;
    private Ingresso[] ingresso = new Ingresso[100];

    public void addIngresso(Ingresso ing){
        for (int i = 0; i <ingresso.length; i++) {
            ingresso[i] = ing;
            break;
        }
    }

    public void mostraDetalheCompras(){
        for(Ingresso i = ingresso){

        }
    }
}
