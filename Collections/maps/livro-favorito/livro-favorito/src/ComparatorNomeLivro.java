import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorNomeLivro implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
        // TODO Auto-generated method stub
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    
}
}
