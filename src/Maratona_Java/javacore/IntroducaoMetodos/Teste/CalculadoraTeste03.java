package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Calculadora;

/**
 * Created by Kadson Lima on 27/09/2024
 *
 * @author Kadson Lima
 */
public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividorDosNumeros(15, 0);
        System.out.println(resultado);
    }
}
