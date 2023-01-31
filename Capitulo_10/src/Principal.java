import java.io.FileNotFoundException;

public class Principal {

    public static void main(String[] args) {
        /*
        System.out.println("Início do método main");
        metodo1();
        System.out.println("Fim do método main");
         */


    }

    public static void metodo1(){
        System.out.println("Início do método 1");
        metodo2();
        System.out.println("Fim do método 1");

        try {
            new java.io.FileInputStream("arquivo.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static void metodo2(){
        System.out.println("Início do método 2");
        int[] array = new int[10];

        try {
            for (int i = 0; i < 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro");
        }
        System.out.println("fim do método 2");
    }
}
