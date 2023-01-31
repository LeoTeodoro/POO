import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionSpeed {

    ArrayList<Integer> lista = new ArrayList<>();
    HashSet<Integer> conjunto = new HashSet<>();
    HashMap<Integer,Integer> mapa = new HashMap<>();

    //Variaveis para pegar os tempos

    long tempoInit = 0;
    long tempoFim = 0;

    // Variavel para guardar o numero de elementos
    int numElementos = 200000;

    //Criando os metodos para a inserçao de dados
    void insereLista(){
        tempoInit = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            lista.add(i);
        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo inserçao na lista: "+ (tempoFim - tempoInit));
    }

    void insereConjunto(){
        tempoInit = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            conjunto.add(i);
        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo inserçao no conjunto: "+ (tempoFim - tempoInit));
    }

    void insereMapa(){
        tempoInit = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            mapa.put(i,i);
        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo inserçao no mapa: "+ (tempoFim - tempoInit));
    }

    public void lerLista(){
        tempoInit = System.currentTimeMillis();
        for (int i = 0; i < numElementos; i++) {
            lista.get(i);
        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de leitura da lista: "+ (tempoFim - tempoInit));
    }

    public void lerConjunto(){
        tempoInit = System.currentTimeMillis();
        for (Integer v : conjunto) {

        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de leitura do conjunto: "+ (tempoFim - tempoInit));
    }

    public void lerMapa(){
        tempoInit = System.currentTimeMillis();
        for (int i = 0; i < mapa.size(); i++) {
            mapa.get(i);
        }
        tempoFim = System.currentTimeMillis();
        System.out.println("Tempo de leitura do mapa: "+ (tempoFim - tempoInit));
    }
}
