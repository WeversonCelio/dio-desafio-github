class Carro{
    String modelo;
    String cor;
    int capacidadeTanque;

    /**
     * construtor vazio
     */
Carro(){

    }

    /**
     * Metodo construtor
     * @param modelo
     * @param cor
     * @param capacidadeTanque
     */
    Carro( String modelo, String cor,   int capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }


    // SET
   public void setModelo(String modelo) {
       this.modelo = modelo;
   }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setcapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    //GETS
    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getcapacidadeTanque() {
        return capacidadeTanque;
    }
    
    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}