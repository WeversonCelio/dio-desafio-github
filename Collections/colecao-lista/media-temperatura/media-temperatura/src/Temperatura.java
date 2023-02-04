public class Temperatura {
    private String mes;
    private Double temperatura;
    

    
 
    public Temperatura(String mes, Double temperatura) {
        this.mes = mes;
        this.temperatura = temperatura;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return "Temperatura [mes=" + mes + ", temperatura=" + temperatura + "]";
    }

    public static void iterator() {
    }

    
    
    
}
