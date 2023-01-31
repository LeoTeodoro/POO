public class Lutador extends Personagem{
    private int danoDaArma;

    public int getDanoDaArma() {
        return danoDaArma;
    }

    public Lutador(int danoDaArma) {
        this.danoDaArma = danoDaArma;
    }

    public void atacar(Personagem alvo, int danoDaArma){
        Thread ataque = new ThreadAtacar(alvo, danoDaArma);
    }
}
