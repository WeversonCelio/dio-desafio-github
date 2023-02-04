import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.DoubleToIntFunction;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criar uma lista com 7 notas");
        List<Double> notas = new ArrayList<>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(6d);
        notas.add(10.0);
        notas.add(4d);
        notas.add(2.0);
        notas.add(7.5);
        System.out.println(notas.toString());
        System.out.println("O index do elemento 10: " + notas.indexOf(10d));

        notas.add(4, 8.0);
        System.out.println(notas.toString());
        System.out.println("O indice do elemento 8.0: " + notas.indexOf(8d));

        notas.set(notas.indexOf(6d), 9.5);

        System.out.println(notas.toString());

        System.out.println("Contem a nota 10: " + notas.contains(10d));

        System.out.println("Imprimir a lisyta");
        for (Double nota : notas) {
            System.out.println(nota);

        }

        System.out.println("A terceira nota: " + notas.get(2));

        System.out.println("exibir a menor nota: " + Collections.min(notas));

        System.out.println("exibir a maior nota: " + Collections.max(notas));

        System.out.print("Soma dos valores: ");

        Iterator<Double> iterator = notas.iterator();

        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println(soma);
        Double media = soma / notas.size();
        System.out.println("Media das notas" + media);

        System.out.println(notas.toString());
        System.out.println("Remove o elemento 2 ");
        notas.remove(2d);
        System.out.println(notas.toString());
        
        System.out.println("Remova o elemento na posicao 2" );
        notas.remove(2);
        System.out.println(notas.toString());


        System.out.println("Remove as notas menores que 7: ");

        Iterator<Double> iterator2 = notas.iterator();

        while(iterator2.hasNext()){
            Double next = iterator2.next();
            if(next <= 7d){
                iterator2.remove();
            }
        }
        System.out.println(notas);

        System.out.println("Apagar a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Lista vazia? "+notas.isEmpty());
        

    }
}
