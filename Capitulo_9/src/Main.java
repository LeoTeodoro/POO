import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //CRIANDO UM CONJUNTO (SET)
        /*
        HashSet conjunto = new HashSet();
        conjunto.add("Inatel");
        conjunto.add("PUC");
        conjunto.add("UNIFEI");
        conjunto.add("Inatel");

        System.out.println(conjunto);



        //CRIANDO UM MAPA
                //opcional//
        HashMap <Integer, String> mapa = new HashMap();
        mapa.put(1753,"Leonardo Teodoro");//chave/ conteudo
        mapa.put(233, "Diego Rodrigues");
         */

        //Chamando as funções
        CollectionSpeed cs = new CollectionSpeed();

        cs.insereLista();
        cs.insereConjunto();
        cs.insereMapa();
        System.out.println("*******************************8");
        cs.lerLista();
        cs.lerConjunto();
        cs.lerMapa();
    }
}
