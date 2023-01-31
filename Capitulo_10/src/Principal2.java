import javax.swing.*;

public class Principal2 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro Numero:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero:"));

        try {
            resultado = num1 / num2;
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entre apenas com números");
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null, "Inexistente");
        }

        JOptionPane.showMessageDialog(null, "Resultado: "+resultado);

    }
}
