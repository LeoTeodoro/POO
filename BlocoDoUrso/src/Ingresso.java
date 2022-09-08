import java.util.Date;

public class Ingresso {
    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaXartao;
    protected Date dataHoraCompra;


    Ingresso(){
        numberGenerator++;
        numero = numberGenerator;

        dataHoraCompra = new Date();
    }

    public float calculaTotalIngresso(){
        float total = valorIngresso + taxaXartao;
        return total;
    }

    public void mostraInfos(){
        System.out.println("Total do ingresso: "+calculaTotalIngresso());
        System.out.println("Número do Ingresso: "+numero);
        System.out.println("Data e hora da compra: "+dataHoraCompra);
    }

}
