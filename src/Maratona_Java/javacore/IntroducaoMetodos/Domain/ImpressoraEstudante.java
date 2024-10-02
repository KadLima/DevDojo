package Maratona_Java.javacore.IntroducaoMetodos.Domain;

/**
 * Created by Kadson Lima on 27/09/2024
 *
 * @author Kadson Lima
 */
public class ImpressoraEstudante {
    public void imprime(Estudante estudante2){
        System.out.println("-------------");

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
        estudante2.nome = "Guilherme";


    }
}
