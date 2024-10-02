package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */
public class AtividadeBreak2 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorDaParcela = valorDoCarro / parcela;
            System.out.println(parcela + " = " + (valorDaParcela));
            if (valorDaParcela <= 1000) {
                break; //Um break precisa estar dentro de um laço de repetição, seja um for ou um Switch

            }
        }
    }
}
