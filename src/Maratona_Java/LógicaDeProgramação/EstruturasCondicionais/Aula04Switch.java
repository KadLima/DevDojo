package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */
public class Aula04Switch {
    public static void main(String[] args) {
        byte dia = 9;
        // Dentro do Switch só pode colocar valores do tipo char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //Pode ficar em qualquer momento do código, dentro do escopo
                System.out.println("Número Inválido");
                break;
        }

    }
}
