public abstract class Personagem implements Movel{
    protected String cor;
    protected int posicaoX;
    protected int posicaoy;

    @Override
    public void movePraCima() {
        posicaoy++;
    }

    @Override
    public void movePraBaixo() {
        posicaoy--;
    }

    @Override
    public void movePraDireita() {
        posicaoX++;
    }

    @Override
    public void movePraEsquerda() {
        posicaoX--;
    }
}
