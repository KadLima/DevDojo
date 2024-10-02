package Maratona_Java.LógicaDeProgramação.ArraysVetores.ArraysMultidimensionais;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ArrayMultiAula02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[] arrays = {1, 2};

        arrayInt[0] = arrays;
        arrayInt[1] = new int[]{2, 3, 4};
        arrayInt[2] = new int[]{4, 5, 6, 7, 8, 9};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------------"); //\n pula uma linha
            for (int array : arrayBase) {
                System.out.print(array + " ");
            }
        }
    }
}
