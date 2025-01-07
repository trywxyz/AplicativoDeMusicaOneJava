package br.com.alura.appmusicas.principal;

import br.com.alura.appmusicas.modelos.MinhasPreferidas;
import br.com.alura.appmusicas.modelos.Musica;
import br.com.alura.appmusicas.modelos.Podcast;

public class Main {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Abc");
        minhaMusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curtir();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            meuPodcast.curtir();
        }


        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.incluir(meuPodcast);
        preferidas.incluir(minhaMusica);
    }
}