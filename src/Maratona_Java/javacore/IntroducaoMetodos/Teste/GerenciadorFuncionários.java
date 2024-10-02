package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.FuncionárioClassGPT;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */

public class GerenciadorFuncionários {
    public static void main(String[] args) {
        String[] nomesFuncionários = {"Kadson", "Kauã", "Macedo"};
        int[] idadeFuncionários = {23, 18, 24};

        for (int i = 0; i < nomesFuncionários.length; i++) {
            FuncionárioClassGPT funcionário = new FuncionárioClassGPT();
            funcionário.nome = nomesFuncionários[i];
            funcionário.idade = idadeFuncionários[i];


            funcionário.imprimirResultado();
            System.out.println();
            funcionário.calcularMediaSalario();
            System.out.println();

            double maiorSalario = funcionário.maiorSalario();
            System.out.println("Maior Salário: " + maiorSalario);
            System.out.println();
        }
    }
}
