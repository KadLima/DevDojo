package Maratona_Java.javacore.SobrecargasMetodos.Teste;

import Maratona_Java.javacore.SobrecargasMetodos.Domain.AnimeAula01;

/**
 * Created by Kadson Lima on 01/10/2024
 *
 * @author Kadson Lima
 */

public class AnimeTeste01 {
    public static void main(String[] args) {
        AnimeAula01 anime = new AnimeAula01();
        anime.init("Dragon Ball", "TV", 234);
        anime.imprime();
//        anime.init2("Dragon Ball", "TV", 234);
//        anime.setNome("Dragon Ball");
//        anime.setTipo("TV");
//        anime.setEpisodios(213);
//        anime.imprime();
    }
}
