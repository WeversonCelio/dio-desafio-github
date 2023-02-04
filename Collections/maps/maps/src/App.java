import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Dicionario de Modelo");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("Gol", 14.4);
            put("Uno", 16.1);
            put("Mobi", 16.1);
            put("hb20", 14.5);
            put("Kwid", 15.4);
            
        }};
        System.out.println(carrosPopulares);
        System.out.println("substituir consumo do gol");
        carrosPopulares.put("Gol", 15.2);
        System.out.println(carrosPopulares.toString());
        System.out.println("o uno esta no carros: "+ carrosPopulares.containsKey("Uno"));

        System.out.println("Consumo do Uno: "+ carrosPopulares.get("Uno"));

        System.out.println("Exibia o modelos ");
       Set<String> modelos = carrosPopulares.keySet();
       System.out.println(modelos);

       System.out.println("Exibir o consumo");
       Collection<Double> consumos = carrosPopulares.values();
       System.out.println(consumos);


       Double ConsumoMax = Collections.max(carrosPopulares.values());
       System.out.println("Consumo mais eficiente " + ConsumoMax);

       Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
       String modeloMax = "";

       for(Map.Entry<String, Double> entry: entries){
        if(entry.getValue().equals(ConsumoMax)){
            modeloMax = entry.getKey();
            System.out.println("Modelo Mais Eficiente: "+ modeloMax  );
        }


       
       }
       


       Double ConsumoMin = Collections.min(carrosPopulares.values());
       String modeloMin ="";
       for (Map.Entry<String,Double> entry : carrosPopulares.entrySet()) {
        
        if(entry.getValue().equals(ConsumoMin)){
            modeloMin = entry.getKey();
            System.out.println("Modelo Menos eficientes: " + modeloMin + " | Com o consumo: "+ ConsumoMin);
        }
    }


        System.out.println("Soma dos consumos ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;


        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        System.out.println("Media de consumo: "+ soma/carrosPopulares.size());

        
        Iterator<Double> iterator2 = carrosPopulares.values().iterator();
        System.out.println(carrosPopulares.toString());

        while(iterator2.hasNext()){
            if(iterator2.next().equals(15.4)){
                iterator2.remove();

            }

        }
        System.out.println(carrosPopulares.toString());


        System.out.println("Ordem de insercao");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>(){{
            put("gol", 14.3);
              put( "uno", 15.6);
            put( "mobi", 16.1);
            put("hb20", 14.5);
            put("kwid",15.6);
        }};

        System.out.println(carrosPopulares2);
        System.out.println("Ordenado pelo dicionario");
        Map<String, Double> carrosPopulares3 = new TreeMap<>(carrosPopulares2);
        System.out.println(carrosPopulares3.toString());

        System.out.println("Apague o dicionario");
        carrosPopulares.clear();
        System.out.println(carrosPopulares.isEmpty());




    }
    }

