public class Assassino extends Personagem implements LutarComArmas{
    private Arma arma;

    public Assassino(int vida, int energia, int poder, String nome) {
        super(vida, energia, poder, nome);
    }

    @Override
    public void atacar(Personagem alvo) {
        int vida = alvo.getVida()-(arma.getDano()*2);
        alvo.setVida(vida);
        System.out.println(alvo.getVida());
    }
}
