package Maratona_Java.javacore.IntroducaoMetodos.Domain;

/**
 * Created by Kadson Lima on 25/09/2024
 *
 * @author Kadson Lima
 */
public class Calculadora {
    public void somaDosNumeros() {   //Quando utilizamos o metódo Void, o programa não vai retornar nada (Retorno é diferente de saída)
        System.out.println(10 + 10);
    }

    public void subtracaoDosNumeros() {
        System.out.println(15 - 7);
    }

    public void multiplicacaoDosNumeros(int num, int num2) { // O que está dentro do parênteses é chamado de parâmetro.
        // A propósito, usamos parenteses para separar metódos de variáveis
        // O indicado é que tenha apenas dois valores por método dentro dos parênteses
        System.out.println(num * num2);
    }

    public double dividorDosNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteracaoDosNumeros (int numero1, int numero2){
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do alteracaoDosNumeros");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 "+ numero2);
    }
    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int temp : numeros){
            soma += temp;

        }
        System.out.println(soma);
    }
    public void somaVarArgs (int... numeros){ //Se tiver mais de um atributo, o VarArgs tem que ficar por último
        int soma = 0;
        for(int temp : numeros){
            soma += temp;

        }
        System.out.println(soma);
    }
}
