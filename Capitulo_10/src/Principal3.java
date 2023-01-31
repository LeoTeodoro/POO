public class Principal3 {
    public static void main(String[] args) {
        //Criando a classe Cadastro e passando alguns códigos para ela
        Cadastro cad = new Cadastro();
        cad.addCodigo("mp-2233");
        cad.addCodigo("bp-a233");
        cad.addCodigo("mp-a6b3");
        cad.addCodigo("bp-2m93");
        cad.addCodigo("i23-233");
        cad.addCodigo("mp2233");

        cad.mostraCodigos();
    }
}
