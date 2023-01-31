/**
 * @author Leonardo Teodoro Costa de Oliveira
 * @since 03/11/22
 * @version 1.0 Versão com apenas soma e subtração
 * Classe responsável por permitir a realização de operaçoes básicas de matemática.
 */
public class OperacoesBasicas {
    public float numero1;
    public float numero2;

    /**
     * Este construtor é mandatório para se receber os parametros das operações
     * @param num1 primeiro número de uma operação
     * @param num2 segundo número de uma operação
     */
    OperacoesBasicas(float num1, float num2){
        numero1 = num1;
        numero2 = num2;
    }

    /**
     * Operação de soma entre dois números
     * @return retorna a soma entre dois números
     */
    public float soma(){
        return numero1+numero2;
    }

    /**
     * Operação de subtração entre dois números
     * @return retorna a subtração entre dois números
     */
    public float subtracao(){
        return numero1-numero2;
    }
}
