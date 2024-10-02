package Maratona_Java.LógicaDeProgramação.ArraysVetores.ArraysMultidimensionais;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ArrayMultiAula01 {
    public static void main(String[] args) {
        int [][] dias = new int[3][3];
        dias [0][0] = 31;
        dias [0][1] = 28;
        dias [0][2] = 31;

        dias [1][0] = 30;
        dias [1][1] = 31;
        dias [1][2] = 30;

        dias [2][0] = 30;
        dias [2][1] = 31;
        dias [2][2] = 30;


        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("----------------");
        for(int[] arrbase : dias){
            for(int num : arrbase){
                System.out.println(num);
            }
        }
    }
}
