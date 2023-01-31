import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos = new ArrayList<>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public void ordenaPrecos(){
        Produto.controle = true;
        Collections.sort(produtos);
    }

    public List<Produto> readProdutos(){
        return produtos;
    }

    public void ordenaNomes(){
        Produto.controle = false;
        Collections.sort(produtos);
    }
}
