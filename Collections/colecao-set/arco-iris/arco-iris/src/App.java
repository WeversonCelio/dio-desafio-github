
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // vermelha, laranja, amarela, verde, azul, anil e violeta

        Set<CorArcoIris> coresArcoIris = new LinkedHashSet<>() {
            {
                add(new CorArcoIris("vermelha", 1));
                add(new CorArcoIris("laranja", 2));
                add(new CorArcoIris("amarela", 3));
                add(new CorArcoIris("verde", 4));
                add(new CorArcoIris("azul", 5));
                add(new CorArcoIris("anil", 6));
                add(new CorArcoIris("violeta", 7));

            }
        };
        // Exiba todas as cores uma abaixo da outra
        System.out.println("Cores do Arco Iris");
        for (CorArcoIris corArcoIris : coresArcoIris) {
            System.out.println("\t" + corArcoIris.cor + "\t");
        }

        // A quantidade de cores que o arco-íris tem
        System.out.println("O arco iris tem " + coresArcoIris.size() + " Cores");

        // Exiba as cores em ordem alfabética
        System.out.println("ordem alfabética");
        Set<CorArcoIris> coresArcoIris2 = new TreeSet<>(coresArcoIris);

        for (CorArcoIris corArcoIris : coresArcoIris2) {
            System.out.println(corArcoIris.getCor());
        }

        // Exiba as cores na ordem inversa da que foi informada
        List<CorArcoIris> coresArcoIrisLista = new ArrayList<>();
        for (CorArcoIris corArcoIris : coresArcoIris) {
            coresArcoIrisLista.add(corArcoIris);
        }
        Collections.reverse(coresArcoIrisLista);

        System.out.println("Arco Iris Invertido");
        for (CorArcoIris corArcoIris : coresArcoIrisLista) {
            System.out.println("\t" + corArcoIris.getCor() + "\t");
        }

        // Exiba todas as cores que começam com a letra ”v”
        System.out.println("cores que começam com a letra 'v'");
        for (CorArcoIris corArcoIris : coresArcoIris) {
            String primeiraLetra = corArcoIris.getCor().substring(0, 1);
            if (primeiraLetra.equals("v")) {
                System.out.println(corArcoIris.getCor());

            }
        }
        System.out.println("cores que começam com a letra 'v'");
        for (CorArcoIris corArcoIris : coresArcoIris) {
            String primeiraLetra = corArcoIris.getCor().substring(0, 1);
            if (primeiraLetra.equals("v")) {

            }
        }

        // Remova todas as cores que não começam com a letra “v”
        Iterator<CorArcoIris> iterator = coresArcoIris.iterator();

        while (iterator.hasNext()) {

            String primeiraLetra = iterator.next().getCor().substring(0, 1);
            if (primeiraLetra.equals("v")) {
                iterator.remove();

            }
        }

        System.out.println(coresArcoIris);

        // Limpe o conjunto
        coresArcoIris.clear();

        // Confira se o conjunto está vazio
        System.out.println("Apos a limpeza,  o set esta vazio? " + coresArcoIris.isEmpty());

    }
}
