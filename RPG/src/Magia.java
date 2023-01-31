public class Magia implements Comparable<Magia>{
    private int nivel;
    private String nome;

    public Magia(int nivel, String nome) {
        this.nivel = nivel;
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static boolean controle;

    @Override
    public int compareTo(Magia magia) {
        if (controle) {
            return Integer.compare(this.nivel, magia.nivel);
        }
        else{
            return CharSequence.compare(this.nome, magia.nome);
        }
    }

    @Override
    public String toString() {
        if(controle){
            return String.valueOf(getNivel());
        }
        else{
            return getNome();
        }

    }
}
