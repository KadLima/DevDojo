package Maratona_Java.javacore.IntroducaoMetodos.Domain;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */
public class EstudanteGPT {
    public String nome;
    public int idade;
    public double[] notas = {7.7, 8.9, 9.2};

    public void imprimirInformacoes() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Idade do Aluno: " + idade);

        for (double impressaoNotas : notas) {
            System.out.println("Nota: " + impressaoNotas);
        }


    }

    public void calculoMediaNotas() {
        double media = 0;
        for (double mediaDasNotas : notas) {
            media += mediaDasNotas;

        }
        System.out.println("Média das Notas: " + media / notas.length);
    }

    public void calculoMaiorNota(){
        double maiorNota = notas[0];
        for (int i = 1; i < notas.length; i++){
            if(notas[i] > maiorNota ){
                maiorNota = notas[i];
            }
        }

        System.out.println("Maior Nota: " + maiorNota);

    }
}
