package Maratona_Java.LógicaDeProgramação.ArraysVetores.Arrays;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExerciciosArray2 {
    public static void main(String[] args) {
      double[] notas = {8.5,7.8,9.2,6.7,8.1};
      double soma = 0;

      for (double i : notas) {
          soma += i;
      }
        double media = soma / notas.length;
        if (media >=7){
            System.out.println("Sua nota foi: "+ media + " Você está Aprovado");
        } else {
            System.out.println("Sua nota foi: "+ media + " Você está Reprovado");
        }

    }

}
