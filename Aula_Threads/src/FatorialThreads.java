public class FatorialThreads extends Thread{
    int numero;

    public FatorialThreads(int numero) {
        this.numero = numero;
    }

    @Override
    public void run(){
        int resultado = 1;
        for (int i = 1; i < numero; i++) {
            resultado = resultado * i;
        }
        System.out.println("Resultado: "+resultado);
    }
}
