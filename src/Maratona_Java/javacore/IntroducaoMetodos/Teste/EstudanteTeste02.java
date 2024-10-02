package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Estudante;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */

public class EstudanteTeste02  {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Guilherme";
        estudante1.idade = 23;
        estudante1.sexo = 'M';

        estudante2.nome = "Letícia";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        estudante1.imprime();
        System.out.println("---------");
        estudante2.imprime();

    }
}
