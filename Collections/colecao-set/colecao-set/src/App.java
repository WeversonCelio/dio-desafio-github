
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

 

public class App {
    public static void main(String[] args) throws Exception {
     Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 8d, 4.6, 0d));

    System.out.println(notas);

    System.out.println("Tem a nota 5?");
    System.out.println(notas.contains(5d));

    System.out.println("A menor nota: "+ Collections.min(notas));

    System.out.println("A maior nota: "+ Collections.max(notas));

    System.out.println("Soma dos Valores");
    Iterator<Double> iterator = notas.iterator();

    Double soma = 0d;

    while(iterator.hasNext()){
        Double next = iterator.next();

        soma += next;

    }

    System.out.println("A soma e: "+ soma);
    System.out.println("Media: " + (soma/notas.size()));

    System.out.println(notas);
    System.out.println();
    notas.remove(0d);
    System.out.println(notas);

    Iterator<Double> iterator2 = notas.iterator();

    while(iterator2.hasNext()){
        Double next = iterator2.next();
        if(next < 7d){
            iterator2.remove();
        }
    }
    System.out.println(notas);


    Set<Double> notas2 = new LinkedHashSet<>();
    notas2.add(7d);
    notas2.add(8.5);
    notas2.add(9.3);
    notas2.add(8d);
    notas2.add(4.6);
    notas2.add(0d);

    System.out.println("LinkedHashSet");
    System.out.println(notas2);


    Set<Double> notas3 = new TreeSet<>(notas2);
System.out.println("Tree set");
    System.out.println(notas3);


    notas.clear();
    System.out.println(notas);
    System.out.println(notas.isEmpty());



    }
}
