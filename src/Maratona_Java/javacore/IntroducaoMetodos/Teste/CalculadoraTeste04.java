package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Calculadora;

/**
 * Created by Kadson Lima on 27/09/2024
 *
 * @author Kadson Lima
 */
public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;

        calculadora.alteracaoDosNumeros(a, b);
        System.out.println("CalculadoraTeste04");
        System.out.println("Num1 " + a);
        System.out.println("Num2 " + b);
    }
}
