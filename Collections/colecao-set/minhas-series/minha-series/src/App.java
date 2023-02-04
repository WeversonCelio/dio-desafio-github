import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("HashSet");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Dark", "drama", 50));
            add(new Serie("The Good Doctor", "drama medico", 45));
        }};
        System.out.println(minhasSeries.toString());


        
        for (Serie serie : minhasSeries) {
            System.out.println("- - - - - - - - - - - - - ");
            System.out.println("Nome: " + serie.getNome());
            System.out.println("Genero: " + serie.getGenero());
            System.out.println("Duracao: " + serie.getTempoEpisodio());
            System.out.println("- - - - - - - - - - - - - ");
            
        }


        System.out.println("\n\n\nLinkedHashSet");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("The Good Doctor", "drama medico", 45));
        }};
        System.out.println(minhasSeries1.toString());


        for (Serie serie : minhasSeries1) {
            System.out.println("- - - - - - - - - - - - - ");
            System.out.println("Nome: " + serie.getNome());
            System.out.println("Genero: " + serie.getGenero());
            System.out.println("Duracao: " + serie.getTempoEpisodio());
            System.out.println("- - - - - - - - - - - - - ");
            
        }


        System.out.println("\n\n\nTreeSet");
        Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries1);

        for (Serie serie : minhasSeries3) {
            System.out.println("- - - - - - - - - - - - - ");
            System.out.println("Nome: " + serie.getNome());
            System.out.println("Genero: " + serie.getGenero());
            System.out.println("Duracao: " + serie.getTempoEpisodio());
            System.out.println("- - - - - - - - - - - - - ");
            
        }

        System.out.println("\n\n\nTreeSet ComparatorNomeGeneroTempoEpisodio");
        Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());


        minhasSeries4.addAll(minhasSeries);
        for (Serie serie : minhasSeries4) {
            System.out.println("- - - - - - - - - - - - - ");
            System.out.println("Nome: " + serie.getNome());
            System.out.println("Genero: " + serie.getGenero());
            System.out.println("Duracao: " + serie.getTempoEpisodio());
            System.out.println("- - - - - - - - - - - - - ");
        }
            


    }
}
