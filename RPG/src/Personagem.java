public abstract class Personagem {
    private String nome;
    private int vida;
    private int energia;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
