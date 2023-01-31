import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int operacao = 0;

        String op = JOptionPane.showInputDialog("1-soma 2-sub 3-mult 4-div");
        operacao = Integer.valueOf(op).intValue();

        String num1 = JOptionPane.showInputDialog("Indique o primeiro número");
        int NUM1 = Integer.valueOf(num1).intValue();
        String num2 = JOptionPane.showInputDialog("Indique o segundo número");
        int NUM2 = Integer.valueOf(num2).intValue();

        switch (operacao){
            case 1:
                System.out.println(NUM1 + NUM2);
                break;

            case 2:
                System.out.println(NUM1 - NUM2);
                break;

            case 3:
                System.out.println(NUM1*NUM2);
                break;

            case 4:
                try {
                    System.out.println(NUM1/NUM2);
                }
                catch(ArithmeticException e) {
                    System.out.println("Número dividido por 0");
                }
                break;
        }
    }
}
