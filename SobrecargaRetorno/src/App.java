public class App {
    public static void main(String[] args) throws Exception {
        double quadrado = Quadrilatero.area(2);
        System.out.println("Area do Quadrado: "+ quadrado);

        double retangulo = Quadrilatero.area(2, 3);
        System.out.println("Area do Retangulo: "+ retangulo);

        double trapezeio = Quadrilatero.area(2, 3, 4);
        System.out.println("Area do Trapezeio: "+ trapezeio);
    }
}
