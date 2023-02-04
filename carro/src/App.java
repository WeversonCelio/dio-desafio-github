public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("Gol");
        carro.setcapacidadeTanque(60);
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Capacidade do tanque: " + carro.getcapacidadeTanque());


        System.out.println("Custo para encher o Tanque: " + carro.totalValorTanque(5.15));
    }
}
