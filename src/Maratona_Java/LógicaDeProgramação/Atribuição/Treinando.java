package Maratona_Java.LógicaDeProgramação.Atribuição;

/**
 * Created by Kadson Lima on 16/09/2024
 *
 * @author Kadson Lima
 */
public class Treinando {
    public static void main(String[] args) {
        float bonus = 4200F;
        bonus += 1300F;
        System.out.println(bonus);
        bonus -= 2200F;
        System.out.println(bonus);
        bonus /= 2F;
        System.out.println(bonus);
        bonus *= 2F;
        System.out.println(bonus);

        int contador = 0;
        System.out.println(contador++);
        System.out.println(contador);

        int contador2 = 0;
        System.out.println(++contador2);
    }
}
