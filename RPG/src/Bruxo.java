import java.util.ArrayList;
import java.util.Collections;

public class Bruxo extends Personagem{
    private ArrayList<Magia> magias = new ArrayList();


    public void adicionaMagia(Magia magia){
        magias.add(magia);
    }
    public void ordenaMagias(){
        Magia.controle = true;
        Collections.sort(magias);
    }
    public ArrayList<Magia> retornaMagias(){
        return magias;
    }
    public void deletarMagia(int index){
        magias.remove(index);
    }
    public void soltarMagia(int index){
        Magia magia = magias.get(index);
        Thread soltarMagia = new ThreadSoltarMagia(magia);
    }
    public int retornaIndexdaMagia(Magia magia){
        return Integer.valueOf(magia.toString());
    }
}