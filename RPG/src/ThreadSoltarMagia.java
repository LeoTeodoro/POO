import java.util.concurrent.TimeUnit;

public class ThreadSoltarMagia extends Thread{

    public ThreadSoltarMagia(Magia magia){
        try {
            TimeUnit.SECONDS.sleep(3);
            System.out.println(magia.getNome() + " foi conjurada");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void run() {
    }
}
