package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */
public class AtividadeBreak {
    public static void main(String[] args) {
        int var = 25;
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            if (i == var) {
                break;
            }
        }
    }
}
