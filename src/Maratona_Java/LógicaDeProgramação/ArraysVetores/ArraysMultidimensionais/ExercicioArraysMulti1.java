package Maratona_Java.LógicaDeProgramação.ArraysVetores.ArraysMultidimensionais;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExercicioArraysMulti1 {
    public static void main(String[] args) {
        int[][] array1 = {{81, 49, 62, 5}, {4, 12, 25, 97}, {83, 15, 22, 4}};
        int soma = 0;

        for (int[] impArray : array1) {
            for (int imp : impArray) {
                soma += imp;
            }
        }
        System.out.println(soma);
    }
}
