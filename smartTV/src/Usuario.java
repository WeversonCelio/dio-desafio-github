public class Usuario {
   

    public static void main(String[] args) throws Exception {
        // criar tv
        SmartTV smartTV = new SmartTV();
        smartTV.status();
        smartTV.ligar();

        // trabalhando  nos canais 
        for (int index = 0; index < 5; index++) {
            smartTV.aumentarCanal();  
        }
        smartTV.status();

        for (int index = 0; index < 12; index++) {
            smartTV.baixarCanal();  
        }
        smartTV.status();

        smartTV.trocarCanal(121);
        smartTV.trocarCanal(117);
        smartTV.status();

        for (int index = 0; index < 12; index++) {
            smartTV.aumentarCanal();   
        }

        // Trabalhando nos volumes
        for (int index = 0; index < 27; index++) {
            smartTV.baixarVolume();  
        }
        smartTV.status();

        for (int index = 0; index < 15; index++) {
            smartTV.aumentarVolume();
        }
        smartTV.status();


        
        // desligando a TV
        smartTV.desligar();

    }
}
