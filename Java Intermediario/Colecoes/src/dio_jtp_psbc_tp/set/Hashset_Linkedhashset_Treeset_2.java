/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Dadas as seguintes informações sobre minhas séries favoritas, crie um conjunto e ordene este
conjunto exibindo:

(nome - genero - tempo de episódio);

Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/

package dio_jtp_psbc_tp.set;

import java.util.*;

public class Hashset_Linkedhashset_Treeset_2 {

    public static void main(String[] args) {

        System.out.println("\n-- Ordem aleatória --");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        System.out.println("\n-- Ordem inserção --");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};
        for (Serie serie: minhasSeries1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        System.out.println("\n-- Ordem Nome --");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNome());
        minhasSeries4.addAll(minhasSeries);
        for (Serie serie:minhasSeries4)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        System.out.println("\n-- Ordem gênero --");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        for (Serie serie:minhasSeries5)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                    serie.getTempoEpisodio());

        /*System.out.println("\n-- Ordem natural (TempoEpisodio) --");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("\n-- Ordem Nome/Gênero/TempoEpisodio --");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());*/

    }

}

class Serie  { // implements Comparable<Serie>

    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {

        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;

    }

    public String getNome() {

        return nome;

    }

    public String getGenero() {

        return genero;

    }

    public Integer getTempoEpisodio() {

        return tempoEpisodio;

    }

    @Override
    public String toString() {

        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Serie serie = (Serie) o;

        return nome.equals(serie.nome) && genero.equals(serie.genero) &&
                tempoEpisodio.equals(serie.tempoEpisodio);

    }

    @Override
    public int hashCode() {

        return Objects.hash(nome, genero, tempoEpisodio);

    }

}

class ComparatorNome implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        return s1.getNome().compareTo(s2.getNome());

    }

}

class ComparatorGenero implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {

        return s1.getGenero().compareTo(s2.getGenero());

    }

}