import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cofrinho {

    private List<Moeda> moedas = new ArrayList<>();

    public void addMoeda(Moeda m){
        moedas.add(m);
    }
    public double getValorTotal(){
        float soma = 0;

        for(int i = 0; i < moedas.size(); i++)
        {
            soma += moedas.get(i).getValor();
        }

        return soma;
    }
    public int getQuantMoedas(){
        int quantMoedas = moedas.size();

        return quantMoedas;
    }
    public Moeda getMoedaMaiorValor(){

        return Collections.max(moedas);
    }
    public void ordenaMoedas(){
        Moeda.controle=true;
        Collections.sort(moedas);
    }
}
