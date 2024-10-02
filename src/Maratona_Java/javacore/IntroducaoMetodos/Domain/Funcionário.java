package Maratona_Java.javacore.IntroducaoMetodos.Domain;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */
public class Funcionário {
    public String nome;
    public int idade;
    public double[] salarios = {2345, 3453, 5423};

    public void imprimirResultados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

    }

}



