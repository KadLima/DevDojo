package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

import java.util.Scanner;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */

public class AtividadeResolucao2 {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);
        System.out.println("Digite o salário anual: ");
        double salarioAnual = salario.nextDouble();

        if (salarioAnual < 34712D) {
            salarioAnual *= 0.097D;
            System.out.println("Seu valor de imposto será de: " + salarioAnual);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            salarioAnual *= 0.3735;
            System.out.println("Seu valor de imposto será de: " + salarioAnual);
        } else {
            salarioAnual *= 0.4950D;
            System.out.println("Seu valor de imposto será de: " + salarioAnual);
        }
    }
}
