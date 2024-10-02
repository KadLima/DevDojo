package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

import java.util.Scanner;

/**
 * Created by Kadson Lima on 17/09/2024
 *
 * @author Kadson Lima
 */

public class Atividade {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        float ValorSalario = resposta.nextFloat();
        String taxa;

        taxa = ValorSalario < 34712F ? "Você vai pagar 9.70% de taxa" : ValorSalario >= 34713F &&
               ValorSalario <= 68507F ? "Você vai pagar 37.25% de taxa" : "Você vai pagar 49.50% de taxa";
        System.out.println(taxa);
    }
}
