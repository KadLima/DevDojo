package Maratona_Java.javacore.IntroducaoClasses.Teste;

import Maratona_Java.javacore.IntroducaoClasses.Domain.Professor;

/**
 * Created by Kadson Lima on 24/09/2024
 *
 * @author Kadson Lima
 */
public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kauã";
        professor.idade = 18;
        professor.sexo = 'M';

        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}
