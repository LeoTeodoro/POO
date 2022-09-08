import java.util.Date;

public class Robo {
    private static long serialNumberGenerator;
    private long serialNumber;
    private Date dataCriacao;
    Processador processador = new Processador();
    Corpo corpo = new Corpo();

    Robo(boolean temProcessador){

    }
    void mostraConfigRobo(){
        System.out.println("Tipo: "+corpo.getTipo());
        System.out.println("cor: "+corpo.getCor());

        System.out.println("marca: "+processador.getMarca());
        System.out.println("Frequencia: "+processador.getFrequenciaProcessamento());
    }
}
