package Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Teste;

import Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Domain.ProdutoGPT;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */
public class ProgramaProduto {
    public static void main(String[] args) {
        ProdutoGPT produto = new ProdutoGPT();
        produto.setNome("Maçã");
        produto.setPreço(3.59);
        produto.setQuantidade(4);
        produto.calcularValorTotal(-2);

    }

}
