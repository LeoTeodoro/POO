public class PacMan extends Personagem {
    private int pontuacao = 0;
    private int vidas = 3;

    public int perdeVida(){

        vidas--;

        return vidas;
    }

    public int ganhaPontos(){

        pontuacao++;

        return pontuacao;
    }


}
