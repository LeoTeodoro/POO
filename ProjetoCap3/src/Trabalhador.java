public class Trabalhador {
    String nome;
    String profissao;
    float salario;
    String rg;
    String dataNascimento;

    void recebeAumento(float valor){
        salario+=valor;
        System.out.println("Seu salário atual é: "+salario);
    }
    float calculaGanhoAnual(){
        float ganhoAnual;
        ganhoAnual = salario*12;
        return ganhoAnual;
    }
    void mostraInfoFuncionario(){
        System.out.println("Nome: "+nome);
        System.out.println("Profissão: "+profissao);
        System.out.println("Salário: "+salario);
        System.out.println("rg: "+rg);
        System.out.println("Nascimento: "+dataNascimento);
    }
}
