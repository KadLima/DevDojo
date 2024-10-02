package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

/**
 * Created by Kadson Lima on 17/09/2024
 *
 * @author Kadson Lima
 */

public class Aula02 {
    public static void main(String[] args) {
        int idade = 15;

        if (idade < 15) {
            System.out.println("Cateogoria Infantil");
        } else if (idade >=15 && idade < 18) {
            System.out.println("Cateogoria Juvenil");
        } else {
            System.out.println("Categoria adulto");
        }
    }
}
