public class Principal {
    public static void main(String[] args) {
        //criando um mago
        Mago mago = new Mago(70,15,30,"Patolino");
        mago.usarHabilidade();

        //criando um guerreiro
        Arma armaG = new Arma("Espada",15);
        Guerreiro guerreiro = new Guerreiro(100,25,15,"Belwolf");
        guerreiro.setArma(armaG);
        guerreiro.atacar(mago);

        //criando um assassino;
        Arma armaA = new Arma("Adaga",25);
        Assassino assassino = new Assassino(60,25,15,"Pedrinho Matador");
        guerreiro.setArma(armaA);
        guerreiro.atacar(guerreiro);
    }
}
