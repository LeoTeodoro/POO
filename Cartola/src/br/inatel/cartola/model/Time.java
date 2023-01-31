package br.inatel.cartola.model;

import java.util.ArrayList;

public class Time {

    public int id;
    public String nome;
    private float dinheiro;

    public float getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float pontuacaoTime;

    public Time(int id, String nome, float dinheiro, float pontuacaoTime) {
        this.id = id;
        this.nome = nome;
        this.dinheiro = dinheiro;
        this.pontuacaoTime = pontuacaoTime;
    }

    public ArrayList<Jogador> jogadores = new ArrayList<>();
}
