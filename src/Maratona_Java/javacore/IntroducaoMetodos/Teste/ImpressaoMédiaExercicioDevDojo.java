package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Funcionário;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */
public class ImpressaoMédiaExercicioDevDojo {
    public static void main(String[] args) {
        Funcionário dadosDosFuncionários = new Funcionário();
        int soma = 0;

        for (double valoresSalarios : dadosDosFuncionários.salarios) {
            soma += valoresSalarios;
        }
        System.out.println("Média dos Salários: " + soma / dadosDosFuncionários.salarios.length);

    }
}
