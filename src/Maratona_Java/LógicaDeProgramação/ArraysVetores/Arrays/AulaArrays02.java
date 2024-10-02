package Maratona_Java.LógicaDeProgramação.ArraysVetores.Arrays;

/**
 * Created by Kadson Lima on 19/09/2024
 *
 * @author Kadson Lima
 */
public class AulaArrays02 {
    public static void main(String[] args) {
        //Cada tipo primitivo tem seu tipo de inicialização padrão no Array
        //Para byte, short, int, long, float e double - 0
        //char '\u0000'''
        //boolean - false
        //String - null

        String [] nomes = new String[3];
        nomes[0] = "João";
        nomes[1] = "Pedro";
        nomes[2] = "Ana";

        for (int i =0; i < nomes.length; i++) { //.length retorna o tamanho do Array dinamicamente.
            System.out.println(nomes[i]);
        }
        nomes = new String [5]; //Fazendo isso, será realocado novos index, e os valores que existiam antes lá em cima para
        //a variável nomes será apagado.

    }
}
