package Maratona_Java.javacore.IntroducaoClasses.Teste;

import Maratona_Java.javacore.IntroducaoClasses.Domain.Estudante;

/**
 * Created by Kadson Lima on 24/09/2024
 *
 * @author Kadson Lima
 */

public class EstudanteTeste {
    public static void main(String[] args) {
        // Você tem uma variável de referência de nome "Estudante" e para criar objetos sempre será necessário utilizar a palavra "new"
        Estudante Estudante = new Estudante();
        Estudante.nome = "Kadson";
        Estudante.idade = 22;
        Estudante.sexo = 'M';

        System.out.println(Estudante.nome);
        System.out.println(Estudante.idade);
        System.out.println(Estudante.sexo);
        System.out.println(Estudante);
    }
}
