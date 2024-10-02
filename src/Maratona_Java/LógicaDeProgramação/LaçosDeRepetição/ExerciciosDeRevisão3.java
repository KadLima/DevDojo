package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExerciciosDeRevisão3 {
    public static void main (String[] args){
        double[] decimais = new double[5];
        decimais[0] = 12.35;
        decimais[1] = 8.98;
        decimais[2] = 7.36;
        decimais[3] = 11.45;
        decimais[4] = 15.17;

       for (double i : decimais) {
           if (i >= 10) {
               System.out.println(i);
           }
       }
    }
}

