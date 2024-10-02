package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 19/09/2024
 *
 * @author Kadson Lima
 */
public class AtividadeBreak3 {
    public static void main(String[] args) {
        double valorDoCarro = 30000;

        for (int parcela = (int) valorDoCarro; parcela >= 1; parcela--) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + ": " + valorParcela );

        }
    }
}


