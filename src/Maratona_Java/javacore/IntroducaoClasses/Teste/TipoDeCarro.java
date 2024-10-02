package Maratona_Java.javacore.IntroducaoClasses.Teste;

import Maratona_Java.javacore.IntroducaoClasses.Domain.Carro;

/**
 * Created by Kadson Lima on 24/09/2024
 *
 * @author Kadson Lima
 */
public class TipoDeCarro {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Honda";
        carro01.modelo = "Civic";
        carro01.ano = 2018;

        carro02.nome = "Fiat";
        carro02.modelo = "Palio";
        carro02.ano = 2014;

        System.out.println(carro01.nome);
        System.out.println(carro01.modelo);
        System.out.println(carro01.ano);

        System.out.println("---------------");

        System.out.println("\n" + carro02.nome);
        System.out.println(carro02.modelo);
        System.out.println(carro02.ano);
    }
}
