public class Principal {

    public static void main(String[] args) {

        //CRIANDO UMA CONTA
/*
        Conta c1 = new Conta();
        c1.setProprietario("Leonardo");
        c1.setNumero(1600);
        c1.setSaldo(1000000f);

        c1.sacar(2000000f);

        System.out.println(c1.getSaldo());

 */
/*
        //CRIANDO DOIS OBJETOS DE CONTA
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        System.out.println(Conta.totalContas);

 */

        Robo robo = new Robo(true);
        Corpo c = new Corpo();
        Processador p = new Processador();

        p.setMarca("Sei la");
        p.setFrequenciaProcessamento(3.4f);
        robo.processador = p;

        c.setTipo("carro");
        c.setCor("Amarelo");
        robo.corpo= c;

        robo.mostraConfigRobo();

    }
}
