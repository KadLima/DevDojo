package Maratona_Java.javacore.IntroducaoClasses.Teste;

import Maratona_Java.javacore.IntroducaoClasses.Domain.Estudante;

/**
 * Created by Kadson Lima on 24/09/2024
 *
 * @author Kadson Lima
 */

public class EstudanteTeste2 {
    public static void main(String[] args) {
        Estudante Estudante1 = new Estudante();
        Estudante Estudante2 = new Estudante();
        Estudante1.nome = "Lima";

        System.out.println(Estudante1.idade);
        System.out.println(Estudante1.sexo);
        System.out.println(Estudante1.nome);
        System.out.println(Estudante2.nome);
    }
}
