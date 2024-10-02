package Maratona_Java.LógicaDeProgramação.ArraysVetores.ArraysMultidimensionais;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExercicioArraysMulti2 {
    public static void main(String[] args) {
        String[][] disciplinas = {
                {"Kadson", "10", "8,5", "7"},
                {"Mayara", "6,5", "9,8", "8,6"},
                {"Kauã", "5", "8,8", "9,5"}
        };

        for (String[] notas : disciplinas) {
            System.out.print(notas[0] + ": ");

            for (int i = 1; i < notas.length; i++) {
                System.out.print(notas[i]);
                if(i < notas.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

    }
}
