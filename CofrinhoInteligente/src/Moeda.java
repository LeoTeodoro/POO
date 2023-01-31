public class Moeda implements Comparable<Moeda> {
    private float valor;
    public static boolean controle;

    public Moeda(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public int compareTo(Moeda m) {
        if (controle) {
            return Float.compare(this.valor, m.valor);
        }
        else{
            return 0;
        }
    }

}
