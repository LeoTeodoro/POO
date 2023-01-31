import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Produto prod1 = new Produto("Leite", 4);
        Produto prod2 = new Produto("Pão", 5);
        Produto prod3 = new Produto("Ovos", 11);

        Carrinho carrinho = new Carrinho();

        carrinho.addProduto(prod1);
        carrinho.addProduto(prod2);
        carrinho.addProduto(prod3);

        carrinho.ordenaPrecos();

        System.out.println(carrinho.readProdutos());

        carrinho.ordenaNomes();
        System.out.println(carrinho.readProdutos());
    }
}
