package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

/**
 * Created by Kadson Lima on 16/09/2024
 *
 * @author Kadson Lima
 */
public class Aula01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Pode comprar");
        } else {
            System.out.println("Else");
        }
        if (!isAutorizado) {
            System.out.println("Não Pode comprar");
        }
        boolean c = false;
        if (c = true) {
            System.out.println("Teste");
        }
    }
}
