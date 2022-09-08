public class Produto {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String etiquetaPreco(){
        String etiqueta = "Nome: "+ this.nome + ", Preço: "+ this.preco;
        return etiqueta;
    }
}
