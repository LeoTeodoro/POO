package br.inatel.cartola.control;

import br.inatel.cartola.model.Jogador;

public class Main {
    public static void main(String[] args) {
        Jogador Vini = new Jogador("Real Madrid", 27f, "Vinicius Junior", 8f, "Atacante", 1);

        AdmJogadores admJogadores = new AdmJogadores();

        admJogadores.InsereJogadores(Vini);

    }
}
