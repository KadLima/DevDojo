package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExerciciosDeRevisão {
    public static void main (String[] args){
        int[] numeros = {2,3,4};
        int soma = 0;

        for (int i : numeros) {
            System.out.println(i);
            soma += i;
        }
        System.out.println("Soma: " + soma);
    }
}

