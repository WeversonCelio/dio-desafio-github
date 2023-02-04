import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

public class App {

    /*
     * Dadas as seguintes informações de id e contato, crie um dicionário e
     * ordene este dicionário exibindo (Nome id - Nome contato);
     * 
     * id = 1 - Contato = nome: Simba, numero: 2222;
     * id = 4 - Contato = nome: Cami, numero: 5555;
     * id = 3 - Contato = nome: Jon, numero: 1111;
     */

    public static void main(String[] args) {
        System.out.println("--\tOrdem aleatória\t--");
        Map<Integer, Contato> agenda = new HashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };
        System.out.println(agenda);
        for (Map.Entry<Integer, Contato> entry : agenda.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Map<Integer, Contato> agenda1 = new LinkedHashMap<>() {
            {
                put(1, new Contato("Simba", 5555));
                put(4, new Contato("Cami", 1111));
                put(3, new Contato("Jon", 2222));
            }
        };
        System.out.println(agenda1);
        for (Map.Entry<Integer, Contato> entry : agenda1.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem id\t--");
        Map<Integer, Contato> agenda2 = new TreeMap<>(agenda);
        System.out.println(agenda2);
        for (Map.Entry<Integer, Contato> entry : agenda2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone POR CLASSE ANONIMA\t--");
        // precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set = new TreeSet<>(
                // implementado como classe anonima
                new Comparator<Map.Entry<Integer, Contato>>() {

                    @Override
                    public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer, Contato> cont2) {
                        return Integer.compare(cont1.getValue().getNumero(), cont2.getValue().getNumero());

                    };
                });
        set.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone POR FUNCIONAL INTERFACE\t--");
        Set<Map.Entry<Integer, Contato>> set2 = new TreeSet<>(Comparator.comparing(
                // tipo de entrada, tipo de saida
                new Function<Map.Entry<Integer, Contato>, Integer>() {

                    @Override
                    public Integer apply(Entry<Integer, Contato> cont) {
                        // TODO Auto-generated method stub
                        return cont.getValue().getNumero();
                    }

                }));
        set2.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry : set2) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        System.out.println("--\tOrdem número telefone POR LAMBDA\t--");
        // interface funcional do comparing e uma metodo de uma functional inteface
        Set<Map.Entry<Integer, Contato>> set3 = new TreeSet<>(Comparator.comparing(
                // variavel -> logica
                cont -> cont.getValue().getNumero()));

        set3.addAll(agenda.entrySet());

        for (Map.Entry<Integer, Contato> entry : set3) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNumero() +
                    ": " + entry.getValue().getNome());
        }

        // System.out.println("--\tOrdem nome contato\t--");
        // // precisamos organizar os valores. Logo:
        // Set<Map.Entry<Integer, Contato>> set1 = new TreeSet<>(new
        // ComparatorOrdemNomeContato());
        // set1.addAll(agenda.entrySet());
        // for (Map.Entry<Integer, Contato> entry : set1) {
        // System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        // }

        System.out.println("--\tOrdem nome contato POR LAMBDA\t--");
        // precisamos organizar os valores. Logo:
        Set<Map.Entry<Integer, Contato>> set4 = new TreeSet<>(Comparator.comparing(
                nome -> nome.getValue().getNome()));

        set4.addAll(agenda.entrySet());
        for (Map.Entry<Integer, Contato> entry : set4) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
    }
}

// class ComparatorOrdemNumerica implements Comparator<Map.Entry<Integer,
// Contato>> {
// @Override
// public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer,
// Contato> cont2) {
// return Integer.compare(cont1.getValue().getNumero(),
// cont2.getValue().getNumero());
// }
// }

// class ComparatorOrdemNomeContato implements Comparator<Map.Entry<Integer,
// Contato>> {
// @Override
// public int compare(Map.Entry<Integer, Contato> cont1, Map.Entry<Integer,
// Contato> cont2) {
// return
// cont1.getValue().getNome().compareToIgnoreCase(cont2.getValue().getNome());
// }
// }
