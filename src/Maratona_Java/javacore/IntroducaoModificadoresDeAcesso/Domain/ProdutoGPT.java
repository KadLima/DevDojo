package Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Domain;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */
public class ProdutoGPT {
    private String nome;
    private double preço;
    private int quantidade;

    public void calcularValorTotal(double porcentagem) {
        if (porcentagem >= 0) {
            System.out.println(String.format("Valor do produto mais desconto: %.2f", (((preço * quantidade) * (100 - porcentagem) / 100))));
        } else {
            System.out.println("Sem desconto aplicado");
            System.out.println("Valor total do produto: " + preço * quantidade);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setPreço(double preço) {
        if (preço < 0) {
            System.out.println("Preço negativo não permitido");
            return;
        }
        this.preço = preço;
    }

    public double getPreço() {
        return this.preço;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            System.out.println("Quantidade negativa não permitida");
            return;
        }
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }
}
