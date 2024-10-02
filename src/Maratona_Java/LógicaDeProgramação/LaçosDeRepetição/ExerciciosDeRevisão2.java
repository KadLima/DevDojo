package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 20/09/2024
 *
 * @author Kadson Lima
 */
public class ExerciciosDeRevisão2 {
    public static void main (String[] args){
        String[] nomes = new String[] {"Kadson","Mayara","Kauã"};

        for (String i : nomes) {
            String maiusculo = i.toUpperCase(); //toUpperCase() deixa o que está na array maiusculo.
            System.out.println(maiusculo);
        }
    }
}

