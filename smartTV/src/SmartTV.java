public class SmartTV {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;

    public void status() {
        System.out.println(" - - -  MINHA TV- - - - ");
        System.out.println("TV ligada? " + ligada);
        System.out.println("Canal Atual? " + canal);
        System.out.println("Volume? " + volume);
        System.out.println("- - - - - - - - - - - - ");
    }

    //metodos ligadas
    public void ligar() {
        ligada = true;
        System.out.println("TV LIGADA!");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV DESLIGA!");
    }
 
    // metodos volumes
    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume Maximo");
        }
    }

    public void baixarVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume: " + volume);
        } else {
            System.out.println("Volume Mudo");
        }
    }

    //metodos canais
    public void trocarCanal(int novoCanal) {
        if(novoCanal >= 1 && novoCanal <=120){
            canal = novoCanal;
            System.out.println("Canal: "+ canal);
        }
        else{
            System.out.println("Canal Invalido");
        }
    }

    public void baixarCanal() {
        if (canal > 1) {
            canal--;
        } else {
            canal = 120;
        }
        System.out.println("canal: " + canal);
    }
    public void aumentarCanal() {
        if (canal < 120) {
            canal++;
        } else {
            canal = 1;
        }
        System.out.println("canal: " + canal);
    }

}
