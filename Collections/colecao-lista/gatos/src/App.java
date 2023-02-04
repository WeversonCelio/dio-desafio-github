import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "Amarelo"));
            add(new Gato("Carmela", 20, "Malhada"));

        }};

        System.out.println(meusGatos);

    System.out.println("lista bangucada");
    Collections.shuffle(meusGatos);
    System.out.println(meusGatos);

    System.out.println("Imprimir os gatos na ordem natural");
    Collections.sort(meusGatos);
    System.out.println(meusGatos);
    
    System.out.println("Imprimir na ordem de idade");
    meusGatos.sort(new ComparatorIdade());
    System.out.println(meusGatos);

    System.out.println("Imprimir na ordem de cor");
    meusGatos.sort(new ComparatorCor());
    System.out.println(meusGatos);

    System.out.println("Imprimir na Ordem Nome, Cor, Idade");
    meusGatos.sort(new ComparatorNomeCorIdade());
    System.out.println(meusGatos);


    }
}
