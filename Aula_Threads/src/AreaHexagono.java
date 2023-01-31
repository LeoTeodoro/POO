public class AreaHexagono extends Thread{

    int lado;

    public AreaHexagono(int lado) {
        this.lado = lado;
    }

    @Override
    public void run(){
        double result = 0;

        result = (3*Math.sqrt(3)*Math.pow(lado,2))/2;

        System.out.println("resultado: "+ result);
    }
}
