
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("Stream ");
        numerosAleatorios.stream().forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);

            }

        });

        System.out.println("Stream com lambda");
        numerosAleatorios.stream().forEach(s -> System.out.println(s));

        System.out.println("Method Reference");
        numerosAleatorios.forEach(System.out::println);

        System.out.println("\tPegar os 5 primeiros numeros em um set");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\tConverter string em interger\t");
        System.out.println("com stream e function");
        numerosAleatorios.stream()
                .map(new Function<String, Integer>() {

                    @Override
                    public Integer apply(String s) {
                        // TODO Auto-generated method stub
                        return Integer.parseInt(s);
                    }

                }).collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("com stream e lambda");
        numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("com Method Reference");
        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println(" salvar em uma variavel Method Reference");
        List<Integer> collect = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("\tNumeros pares maiores que 2\t");
        System.out.println("Com  stream function ");
        List<Integer> collectListParesMaioresDois = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {

                    @Override
                    public boolean test(Integer i) {
                        // TODO Auto-generated method stub
                        if (i > 2 && i % 2 == 0)
                            return true;
                        return false;
                    }

                }).collect(Collectors.toList());
        System.out.println(collectListParesMaioresDois);

        System.out.println("Com  stream Lambda ");

        List<Integer> collectListParesMaioresDois2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i > 2 && i % 2 == 0))
                .collect(Collectors.toList());

        System.out.println(collectListParesMaioresDois2);

        System.out.println("\tMostra media\t");
        System.out.println("Com  stream function ");
        numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {

                    @Override
                    public int applyAsInt(String s) {
                        // TODO Auto-generated method stub
                        return Integer.parseInt(s);

                    }

                }).average()
                .ifPresent(new DoubleConsumer() {

                    @Override
                    public void accept(double v) {
                        // TODO Auto-generated method stub
                        System.out.println(v);

                    }

                });

        System.out.println("com Method Reference ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);



                System.out.println("\tRemove Numeros Impares\t");
        List<Integer> numerosAleatoriosIntegers = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        
        System.out.println("Com  stream function ");
        numerosAleatoriosIntegers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer i) {
                if(i % 2 !=0) return true;
                return false;
            }
            
        });
        System.out.println(numerosAleatoriosIntegers);

        

        System.out.println("Com  stream Lambda ");
        List<Integer> numerosAleatoriosIntegers2 = numerosAleatorios.stream()
        .map(Integer::parseInt)
        .collect(Collectors.toList());

        numerosAleatoriosIntegers2.removeIf( i -> (i % 2 !=0));
        System.out.println(numerosAleatoriosIntegers2);










    }
}
