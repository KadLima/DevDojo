package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Pessoa;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */

public class ProgramFixacao2 {
    public static void main(String[] args) {
        Pessoa nomePessoa = new Pessoa();
        System.out.println(nomePessoa.nome);
        nomePessoa.alterarNome();
    }
}
