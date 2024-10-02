package Maratona_Java.LógicaDeProgramação.ExerciciosDeFixação;

/**
 * Created by Kadson Lima on 23/09/2024
 *
 * @author Kadson Lima
 */
public class Exercício3 {
    public static void main(String[] args) {
        int[] valoresArray = {11, 23, 32, 54, 48, 63, 85, 57, 62, 81};
        for (int numeros : valoresArray) {
            if (numeros % 2 == 0) {
                System.out.println("Números pares do Array: " + numeros);
            }
        }
    }
}
