package Maratona_Java.LógicaDeProgramação.TiposPrimitivos;

/**
 * Created by Kadson Lima on 12/09/2024
 *
 * @author Kadson Lima
 */

public class Aula01 {
    public static void main(String[] args) {
        String nome = "Kadson";
        String endereço = "Rua josé paes de barros - 51011-420";
        float salario = 1412.15F;
        String dataRecebimento = "25 de Setembro";

        System.out.println("Eu " + nome + ", morando no endereço " + endereço + ", confirmo que recebi o salário de " + salario +
                ", na data " + dataRecebimento);

        float resto = 174%4;
        System.out.println(resto);
    }
}
