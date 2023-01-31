import java.util.ArrayList;

public class Cadastro {

    //Arrays para guardar codigos validos e invalidos
    ArrayList <String> codigosValidos = new ArrayList();
    ArrayList <String> codigosInvalidos = new ArrayList();

    //Metodo para adicionar codigos
    public void addCodigo(String codigo){
        if(codigo.length() == 7 &&
                codigo.startsWith("mp-") ||
                codigo.startsWith("dp-") ||
                codigo.startsWith("bp-")){
            codigosValidos.add(codigo);
        }
        else{
            try {
                throw new CodigoInvalidoException();
            }catch(CodigoInvalidoException e){
                codigosInvalidos.add(codigo);
            }

        }
    }

    //Metodo para mostrar codigos
    public void mostraCodigos(){
        System.out.println("Códigos válidos: "+codigosValidos);
        System.out.println("Códigos inválidos: "+codigosInvalidos);
    }

}
