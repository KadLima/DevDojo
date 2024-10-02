package Maratona_Java.LógicaDeProgramação.EstruturasCondicionais;

/**
 * Created by Kadson Lima on 17/09/2024
 *
 * @author Kadson Lima
 */
public class Aula03OperadorTernário {
    public static void main(String[] args) {
        double salario = 5100;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNãoDoar = "Ainda não tenho condições";

        String resultado = salario > 5000 ? mensagemDoar : mensagemNãoDoar;
        // O Operador Ternário substitui, óbvio, em alguns casos somente, o uso de IF e ELSE. Se atentar a sua sintaxe
        // String (nome da variável) = (Valor da variável) > x ? Valor se verdadeiro : Valor se Falso

        System.out.println(resultado);

        /**if (salario >= 5000) {
            resultado = mensagemDoar;
            System.out.println(resultado);
        }else {
            resultado = mensagemNãoDoar;
            System.out.println(resultado);

        }*/
    }
}
