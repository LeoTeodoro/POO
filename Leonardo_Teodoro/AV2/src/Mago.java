public class Mago extends Personagem{
    public Mago(int vida, int energia, int poder, String nome) {
        super(vida, energia, poder, nome);
    }

    @Override
    public void usarHabilidade() {
        System.out.println("Usando habilidade mágica");
        int poder = getPoder()-2;
        setPoder(poder);
        int energia = getEnergia()-1;
        setEnergia(energia);
    }
}
