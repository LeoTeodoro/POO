
public class Notebook extends Produto {
    private double armazenamento;
    private String gpu;

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    private String processador;

    @Override
    public String etiquetaPreco(){
        String etiqueta =  super.etiquetaPreco() + ", Armazenamento: "+ this.armazenamento+", GPU: "+this.gpu+", Processador: "+this.processador;
        return etiqueta;
    }
}
