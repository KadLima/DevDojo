package Maratona_Java.LógicaDeProgramação.LaçosDeRepetição;

/**
 * Created by Kadson Lima on 18/09/2024
 *
 * @author Kadson Lima
 */
public class Aula06Whiles {
    public static void main(String[] args) {
        //while, do while, for
      int count = 0;

      while(count < 10){
          System.out.println(count++);
      }
      do {
          System.out.println("Dentro do do While");
      } while (count < 10);

      for (int i = 0; i < 10; i++) {
          System.out.println("For " + i);
      }
    }
}
