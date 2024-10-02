package Maratona_Java.javacore.IntroducaoMetodos.Domain;


/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */
public class FuncionárioClassGPT {
    public String nome;
    public int idade;
    public double[] salarios = {1232, 4234, 2432};

    public void imprimirResultado() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double valoresSalarios : salarios) {
            System.out.print(valoresSalarios + " ");
        }
        System.out.println();
    }

    public void calcularMediaSalario() {
        double mediaSalarial = 0;
        for (double media : salarios) {
            mediaSalarial += media;
        }
        mediaSalarial /= salarios.length;
        System.out.println("Media Salarial:" + mediaSalarial);
    }

    public double maiorSalario() {
        double maiorSalarioDentreTodos = salarios[0];
        for (int i = 1; i < salarios.length; i++) {
            if(salarios[i] > maiorSalarioDentreTodos){
                maiorSalarioDentreTodos = salarios[i];
            }

        }
        return maiorSalarioDentreTodos / salarios.length;
    }
}

