import java.util.concurrent.TimeUnit;

public class contaSegundos extends Thread{
    int numero;

    public contaSegundos(int numero) {
        this.numero = numero;
    }

    @Override
    public void run(){
        for (int i = 1; i <= numero; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(i + "s");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
