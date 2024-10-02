package Maratona_Java.LógicaDeProgramação.ExerciciosDeFixação;

/**
 * Created by Kadson Lima on 23/09/2024
 *
 * @author Kadson Lima
 */

public class Exercicios2 {
    public static void main(String[] args) {
        for (int valorInicial = 1; valorInicial <= 100; valorInicial++) {
            if (valorInicial % 3 == 0 && valorInicial % 5 == 0) {
                System.out.println(valorInicial + ": --> " + "FizzBuzz");
            } else if (valorInicial % 3 == 0) {
                System.out.println(valorInicial + ": --> " + "Fizz");
            } else if (valorInicial % 5 == 0) {
                System.out.println(valorInicial + ": --> " + "Buzz");
            } else {
                System.out.println(valorInicial);
            }

        }
    }
}
