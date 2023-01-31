import java.util.concurrent.TimeUnit;

public class ThreadAtacar extends Thread{
    @Override
    public void run() {
        super.run();
    }

    public ThreadAtacar(Personagem alvo, int danoDaArma){
        try {
            TimeUnit.SECONDS.sleep(2);
            alvo.setVida(alvo.getVida()-danoDaArma);
            System.out.println(alvo.getNome() + " foi atacado");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
