package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.EstudanteGPT;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */

public class GerenciadorEstudante {
    public static void main(String[] args) {
        EstudanteGPT estudante = new EstudanteGPT();
        EstudanteGPT estudante1 = new EstudanteGPT();
        EstudanteGPT estudante2 = new EstudanteGPT();

        estudante.nome = "Kadson";
        estudante.idade = 23;

        estudante1.nome = "Kauã";
        estudante1.idade = 18;
        estudante1.notas = new double[] {8.3, 7.8, 9.2};

        estudante2.nome = "Letícia";
        estudante2.idade = 18;
        estudante2.notas = new double[] {6.3, 9.8, 8.2};

        imprimirTodosOsDados(estudante);
        imprimirTodosOsDados(estudante1);
        imprimirTodosOsDados(estudante2);


    }

    public static void imprimirTodosOsDados(EstudanteGPT estudante){
        estudante.imprimirInformacoes();
        System.out.println("------------");
        estudante.calculoMediaNotas();
        estudante.calculoMaiorNota();
        System.out.println();
    }
}
