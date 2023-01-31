public class Guerreiro extends Personagem implements LutarComArmas{
    private Arma arma;

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Guerreiro(int vida, int energia, int poder, String nome) {
        super(vida, energia, poder, nome);
    }


    @Override
    public void atacar(Personagem alvo) {
        int vida = alvo.getVida() - arma.getDano();
        alvo.setVida(vida);
        System.out.println(alvo.getVida());
    }
}
