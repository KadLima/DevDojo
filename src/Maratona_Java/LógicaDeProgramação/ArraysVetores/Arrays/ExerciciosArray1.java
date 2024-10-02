package Maratona_Java.LógicaDeProgramação.ArraysVetores.Arrays;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExerciciosArray1 {
    public static void main(String[] args) {
        int[] elementos = {2, 25, 89, 75, 48, 73, 96, 22, 11, 68};
        int impar = 0;
        int par = 0;

        for (int i : elementos) {
            if (i % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Numeros Pares: " + par);
        System.out.println("Numeros impares: " + impar);
    }
}
