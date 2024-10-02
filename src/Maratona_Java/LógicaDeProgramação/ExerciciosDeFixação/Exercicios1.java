package Maratona_Java.LógicaDeProgramação.ExerciciosDeFixação;

import java.util.Scanner;

/**
 * Created by Kadson Lima on 23/09/2024
 *
 * @author Kadson Lima
 */


public class Exercicios1 {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        System.out.print("Qual a sua idade: ");
        int idade = resposta.nextInt();

        if (idade < 18){
            System.out.println("Você é menor de idade");
        } else if (idade >= 18 && idade < 60){
            System.out.println("Você é Maior de idade");
        } else {
            System.out.println("Você é idoso");
        }
        resposta.close();
    }
}
