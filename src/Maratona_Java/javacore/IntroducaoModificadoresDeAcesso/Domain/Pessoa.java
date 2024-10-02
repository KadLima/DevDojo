package Maratona_Java.javacore.IntroducaoModificadoresDeAcesso.Domain;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */
public class Pessoa {
    private String nome; // Um modificador de acesso privado significa que os atributos presentes nele só poderão ser acessado pelo objeto.
    private int idade;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome; //Se você tiver uma variável com o mesmo nome de um atributo, por exemplo, você tem que usar o this.
        // Exemplo, se mudarmos o nome da referência "String nome" para "String nome1", não será necessário usar o this.
    }

    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }
}
