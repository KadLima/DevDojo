package Maratona_Java.LógicaDeProgramação.ExerciciosDeFixação;

/**
 * Created by Kadson Lima on 23/09/2024
 *
 * @author Kadson Lima
 */

public class Exercício4 {
    public static void main(String[] args) {
        int[] repeticaoArray = new int[] {10,23,54,35,76,8,53,576,43,123};
        for (int numerosArray = repeticaoArray.length - 1; numerosArray >= 0; numerosArray--) {
            System.out.println(repeticaoArray[numerosArray]);
        }
    }
}
