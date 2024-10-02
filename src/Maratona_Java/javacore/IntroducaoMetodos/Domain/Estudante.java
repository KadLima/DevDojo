package Maratona_Java.javacore.IntroducaoMetodos.Domain;

/**
 * Created by Kadson Lima on 27/09/2024
 *
 * @author Kadson Lima
 */
public class Estudante {
    public String nome;

    public int idade;

    public char sexo;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
