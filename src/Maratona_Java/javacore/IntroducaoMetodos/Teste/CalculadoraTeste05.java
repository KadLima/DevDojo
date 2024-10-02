package Maratona_Java.javacore.IntroducaoMetodos.Teste;

import Maratona_Java.javacore.IntroducaoMetodos.Domain.Calculadora;

/**
 * Created by Kadson Lima on 30/09/2024
 *
 * @author Kadson Lima
 */
public class CalculadoraTeste05 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,566,6,7); //O VarArgs consegue fazer a soma diretamente no objeto, sem precisar criar um array
    }
}
