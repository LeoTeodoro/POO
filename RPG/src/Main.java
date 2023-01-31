public class Main {
    public static void main(String[] args) {
        Bruxo bruxo = new Bruxo();
        bruxo.setVida(100);
        bruxo.setNome("Patolino implacavel");
        bruxo.setEnergia(100);

        Lutador lutador = new Lutador(20);
        lutador.setVida(100);
        lutador.setNome("Junin");
        lutador.setEnergia(100);

        Magia magia1 = new Magia(2, "Incendiar");
        Magia magia2 = new Magia(3, "Desaparecer");
        Magia magia3 = new Magia(2, "Revigorar");

        bruxo.adicionaMagia(magia1);
        bruxo.adicionaMagia(magia2);
        bruxo.adicionaMagia(magia3);

        bruxo.ordenaMagias();

        bruxo.deletarMagia(2);

        bruxo.retornaMagias();

        bruxo.soltarMagia(1);

        lutador.atacar(bruxo, lutador.getDanoDaArma());
    }
}
