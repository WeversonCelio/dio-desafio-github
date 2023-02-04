import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\tOrdem Aleatoria\t");

        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 290));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harani, Yuval", new Livro("21 Licoes do Seculo XXI",432));
        }};
        for(Map.Entry<String, Livro> livro: meusLivros.entrySet()){
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }
        System.out.println("\tOrdem de insercao\t");
        Map<String, Livro> meusLivros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma Breve Historia do Tempo", 290));
            put("Duhigg, Charles", new Livro("O Poder do Habito", 408));
            put("Harani, Yuval", new Livro("21 Licoes do Seculo XXI",432));
        }};

        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
            
        }
        System.out.println("\tOrdem de autor\t");

        Map<String, Livro> meusLivros3 = new TreeMap<>(meusLivros);

        for (Map.Entry<String, Livro> livro : meusLivros3.entrySet()) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
            
        }

        System.out.println("\tOrdem Alfabetica Nome Livros\t");

        Set<Map.Entry<String, Livro>> meusLivros4 = new TreeSet<>(new ComparatorNomeLivro());
        meusLivros4.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros4) {
            System.out.println(livro.getKey() + " - "+ livro.getValue().getNome());
            
        }
    }
}

 
