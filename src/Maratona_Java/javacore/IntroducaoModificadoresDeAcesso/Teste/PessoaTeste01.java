package Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Teste;

import Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Domain.Pessoa;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */
public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Kadson");
        pessoa.setIdade(23);
        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}
