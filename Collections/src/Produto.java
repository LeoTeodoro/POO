public class Produto implements Comparable<Produto> {
    private String nome;
    private int preco;
    public static boolean controle;

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getPreco() {
        return String.valueOf(preco);
    }

    @Override
    public int compareTo(Produto prod) {
        if (controle) {
            return Integer.compare(this.preco, prod.preco);
        }
        else{
            return CharSequence.compare(this.nome, prod.nome);
        }
    }

    @Override
    public String toString() {
        if(controle){
            return getPreco();
        }
        else{
            return getNome();
        }

    }
}
