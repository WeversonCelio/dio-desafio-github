import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Faça um programa que receba a temperatura média dos 6
// primeiros meses do ano e armazene-as em uma lista.

// Após isto, calcule a média semestral das temperaturas e
// mostre todas as temperaturas acima desta média, e em que
// mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
// – Fevereiro e etc).

public class App {
    public static void main(String[] args) throws Exception {
        List<Temperatura> temperaturas = new ArrayList<>(){{
            add(new Temperatura("Janeiro", 24.0));
            add(new Temperatura("Fevereiro", 25.5));
            add(new Temperatura("Marco", 22.2));
            add(new Temperatura("Abril", 26.1));
            add(new Temperatura("Maio", 21.2));
            add(new Temperatura("Junho", 24.3));

        }};
        System.out.println(temperaturas);
        Iterator<Temperatura> iterator = temperaturas.iterator();

        Double soma = 0d;
        while(iterator.hasNext()){
        Double next = iterator.next().getTemperatura();
        soma += next;
        }

        Double mediaTemperatura = soma/temperaturas.size();
        System.out.println("A media de temperatura e " + mediaTemperatura);

for (Temperatura t : temperaturas) {
    Double temperatura = t.getTemperatura();
    if(temperatura>mediaTemperatura){
       String mes =t.getMes();
       System.out.println("O mes de " + mes + " teve a temperatura acima da media, com " + temperatura + "c");
    }


    
}


        

    }

  
}
