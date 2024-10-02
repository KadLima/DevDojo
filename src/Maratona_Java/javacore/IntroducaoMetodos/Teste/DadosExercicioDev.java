package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Funcionário;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */
public class DadosExercicioDev {
    public static void main(String[] args) {
        Funcionário dadosDosFuncionários = new Funcionário();
        dadosDosFuncionários.nome = "Kadson";
        dadosDosFuncionários.idade = 23;

        dadosDosFuncionários.imprimirResultados();

        for (double salariosValores : dadosDosFuncionários.salarios){
            System.out.print(salariosValores + " | ");
        }


    }
}
