public class Casa {
    String endereco;
    Quarto[] quartos;
    String cor;

    Casa(String endereco, String cor, Quarto[] quartos){
        this.endereco = endereco;
        this.cor = cor;
        this.quartos = quartos;
    }

    public void mostraInfo(){
        System.out.println("Endereço: "+endereco);
        for (int i = 0; i < quartos.length ; i++) {
            if(quartos[i]!=null) {
                System.out.println("número de postas do quarto " + i + ": " + quartos[i].getNumeroDePortas());
            }
        }
        System.out.println("Cor: "+ cor);
    }

}
