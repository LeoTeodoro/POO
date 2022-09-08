public class Principal {
    public static void main(String[] args) {
        Notebook notebook = new Notebook();
        Camiseta camiseta = new Camiseta();

        notebook.setNome("Lenovo idealpad 3");
        notebook.setPreco(3500.00);
        notebook.setArmazenamento(500);
        notebook.setProcessador("inte core i5");
        notebook.setGpu("quad core");
        System.out.println("Etiqueta: "+ notebook.etiquetaPreco());

        camiseta.setNome("BAW");
        camiseta.setPreco(200.00);
        camiseta.setTamanho("G");
        camiseta.setCor("Branca");
        System.out.println("Etiqueta: " + camiseta.etiquetaPreco());
    }
}
