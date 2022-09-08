public class ClassePrincipal {
    public static void main(String[] args) {

        //Criando um objeto e apontando para o mesmo
        //Inserindo informações
        /*
        Pessoa p1 = new Pessoa();
        p1.nome = "Diego";
        p1.idade = 19;
        p1.cpf = "123.456.789-00";

        Pessoa p2 = new Pessoa();
        p2.nome = "Izaque";
        p2.idade = 19;
        p2.cpf = "678.943.542-25";

        Pessoa p3 = new Pessoa();
        p3.nome = "Maria Luiza";
        p3.idade = 20;
        p3.cpf = "123.432.543-54";

        //Declarando ações
        p1.comer();
        p2.dormir();
        p3.tomarAgua();

         //PET

        AnimalPet pet1 = new AnimalPet();
        AnimalPet pet2 = new AnimalPet();

        pet1.nome = "Pig";
        pet1.especie = "Labrador";
        pet1.idade = 3;
        pet1.comida = "ração";
        pet1.som = "Auau";

        pet2.nome = "Bruno";
        pet2.especie = "golden";
        pet2.idade = 5;
        pet2.comida = "ração";
        pet2.som = "RUFRUF";

        pet1.comer();
        pet1.dormir(3);
        pet1.fazerBarulho();
        pet1.movimentar(100);

        pet2.comer();
        pet2.dormir(6);
        pet2.fazerBarulho();
        pet2.movimentar(150);

         */

        //TRABALHADOR

        float salarioAnual;

        Trabalhador trab1 = new Trabalhador();
        Trabalhador trab2 = new Trabalhador();

        trab1.nome = "Manuel";
        trab1.rg = "MG-434.324.32";
        trab1.dataNascimento = "23/04/1999";
        trab1.salario = 4000;
        trab1.profissao = "Pedreiro";

        trab2.nome = "Alice";
        trab2.rg = "SP-324.342.43";
        trab2.dataNascimento = "14/12/1996";
        trab2.salario = 13000.80f;
        trab2.profissao = "Médica";

        trab1.mostraInfoFuncionario();
        trab1.recebeAumento(500);
        salarioAnual = trab1.calculaGanhoAnual();
        System.out.println("Seu salário anual é: "+salarioAnual);

        trab2.mostraInfoFuncionario();
        trab2.recebeAumento(1000);
        salarioAnual = trab2.calculaGanhoAnual();
        System.out.println("Seu salário anual é: "+salarioAnual);
    }
}
