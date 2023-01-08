/**
 * <h3> Class SMARTTV</h3>
 * Classe Smart TV com os atributos canal, volume e estado ligado. Seus metodos são
 *  a alteração do canal, alteração do volume e alteração do metodos de troca de canal. 
 * @author Weverson Celio
 * @version 1.0
 * @since 08/01/2023
 */
public class SmartTV {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    /**
     * mostra o estado atual da TV
     */
    public void status() {
        System.out.println(" - - -  MINHA TV- - - - ");
        System.out.println("TV ligada? " + ligada);
        System.out.println("Canal Atual? " + canal);
        System.out.println("Volume? " + volume);
        System.out.println("- - - - - - - - - - - - ");
    }

    //metodos ligadas
    /**
     * altera o estado da tv de deligado para ligado
     */
    public void ligar() {
        ligada = true;
        System.out.println("TV LIGADA!");
    }

    /**
     * altera o estado da tv de ligado para desligado
     */
    public void desligar() {
        ligada = false;
        System.out.println("TV DESLIGA!");
    }
 
    // metodos volumes
    /**
     * aumenta o volume da TV de 1 ponto a cada vez que o metodo é chamado.
     * O volume maximo é de 100. 
     */
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume Maximo");
        }
    }

    /**
     * abaixa o volume do som  a cada vez que o metodo é chamado. 
     * O volume minimo é 0
     */
    public void baixarVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume Mudo");
        }
    }

    //metodos canais
    /**
     * Altera o canal da TV.
     * @param novoCanal numero do novo canal. o Intervalo de canais disponives é de 1 a 120.
     */
    public void trocarCanal(int novoCanal) {
        if(novoCanal >= 1 && novoCanal <=120){
            canal = novoCanal;
            System.out.println("Canal: "+ canal);
        }
        else{
            System.out.println("Canal Invalido");
        }
    }

    /**
     * Altera o canal de ordem decrescente, no intevalo de 1 a 120.  
     */
    public void baixarCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 120;
        }
        System.out.println("canal: " + canal);
    }
    /**
     * Altera o canal de ordem crescente, no intevalo de 1 a 120.  
     */
    public void aumentarCanal() {
        if (canal < 120) {
            canal++;
        } else {
            canal = 1;
        }
        System.out.println("canal: " + canal);
    }

}
