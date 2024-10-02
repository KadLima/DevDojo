package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Estudante;
import Maratona_Java.javacore.IntroducaoMetodos.Domain.ImpressoraEstudante;

/**
 * Created by Kadson Lima on 27/09/2024
 *
 * @author Kadson Lima
 */

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.nome = "Kadson";
        estudante.idade = 23;
        estudante.sexo = 'M';

        estudante2.nome = "May";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        impressora.imprime(estudante2);
        impressora.imprime(estudante);

        impressora.imprime(estudante);
        impressora.imprime(estudante2);
    }
}
