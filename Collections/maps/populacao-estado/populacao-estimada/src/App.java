import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) throws Exception {

        // Dada a população estimada de alguns estados do NE brasileiro, faça:

        // Estado = PE - População = 9.616.621

        // Estado = AL - População = 3.351.543

        // Estado = CE - População = 9.187.103

        // Estado = RN - População = 3.534.265

        // Crie um dicionário e relacione os estados e suas populações;
        Map<String, Integer> estados = new LinkedHashMap<>(){{
            put("PE", 9616621);
             put("AL", 3351543);
             put("CE", 9187103);
             put("RN", 3534265);
        }};

        System.out.println(estados);
        // Substitua a população do estado do RN por 3.534.165;

        estados.put("RN", 3534165);
        System.out.println(estados);
        // Confira se o estado PB está no dicionário, caso não adicione: PB -
        // 4.039.277;
        if(estados.containsKey("PB")==false){
            estados. put("PB", 4039277);
        }
        System.out.println(estados);
 

        // Exiba a população PE;
        System.out.println("Populacao de PE: "+estados.get("PE"));

        // Exiba todos os estados e suas populações na ordem que foi
        // informado;
        Set<Map.Entry<String, Integer>> entries = estados.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
            
        }
        // Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> estados2 = new TreeMap<>(estados);
        System.out.println(estados2);

        // Exiba o estado com o menor população e sua quantidade;
        Integer menorPopulacao = Collections.min(estados.values());
        String menorEstado = "";
        for (Map.Entry<String,Integer> entry : estados.entrySet()) {
            if(entry.getValue().equals(menorPopulacao)){
                menorEstado = entry.getKey();
                System.out.println("Menor Pop. estado "+ menorEstado + " - " + menorPopulacao);
            }
            
        }

        // Exiba o estado com a maior população e sua quantidade;
        Integer maiorPopulacao = Collections.max(estados.values());
        String maiorEstado = "";
        for (Map.Entry<String,Integer> entry : estados.entrySet()) {
            if(entry.getValue().equals(maiorPopulacao)){
                maiorEstado = entry.getKey();
                System.out.println("Maior Pop. estado "+ maiorEstado + " - " + maiorPopulacao);
            }
            
        }


        // Exiba a soma da população desses estados;
        Iterator<Integer> iterator = estados.values().iterator();

        Integer soma = 0;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma da pop: "+ soma);

        // Exiba a média da população deste dicionário de estados;
        System.out.println("Media: "+soma/estados.size() );

        // Remova os estados com a população menor que 4.000.000;
        Iterator<Integer> iterator2 = estados.values().iterator();

        while(iterator2.hasNext()){
            if(iterator2.next()<4000000){
                iterator2.remove();
            }
        }
        System.out.println(estados);

        // Apague o dicionário de estados;
        estados.clear();

        // Confira se o dicionário está vazio.
        System.out.println("Esta vazio? "+estados.isEmpty());
    }
}
