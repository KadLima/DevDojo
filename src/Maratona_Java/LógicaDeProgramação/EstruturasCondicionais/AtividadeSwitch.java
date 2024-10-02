package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

import java.util.Scanner;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */


public class AtividadeSwitch {
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);
        System.out.println("Qual dia você escolhe: ");
        int diaEscolhido = dia.nextByte();
        switch (diaEscolhido) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;

            default:
                System.out.println("Escolha entre 1 a 7");
                break;
        }
    }
}
