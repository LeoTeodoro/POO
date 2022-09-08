public class AnimalPet {
    String nome;
    String especie;
    String som;
    String comida;
    int idade;

    void comer(){
        System.out.println("O(A) "+nome+" comeu "+comida);
    }

    void dormir(int horas){
        System.out.println("O(A) "+nome+" dormiu por "+horas+" horas.");
    }

    void movimentar(int metros){
        System.out.println("O(A) "+nome+" andou por "+metros+" metros.");
    }

    void fazerBarulho(){
        System.out.println("O(A) "+nome+" fez "+som);
    }
}
