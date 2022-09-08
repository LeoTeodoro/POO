public class Camiseta extends Produto{
    private String cor;
    private String tamanho;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    @Override
    public String etiquetaPreco() {
        String etiqueta = super.etiquetaPreco() + ", Cor: "+this.cor+", Tamanho: "+this.tamanho;

        return etiqueta;
    }
}
