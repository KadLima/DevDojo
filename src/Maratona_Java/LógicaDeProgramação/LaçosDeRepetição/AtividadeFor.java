package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */
public class AtividadeFor {
    public static void main(String[] args) {

        int numero = 1000000;
        for (int i=0; i <= numero; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
