/**
 * Classe para calcular a area dos quadrilateros
 * @version 1.0
 * @author Weverson Celio
 */
public class Quadrilatero {
    /**
     * Usado para Calcular a area do Quadrado
     * @param lado lado do quadrado
     * @return retornar a area
     */
    public static double area(double lado){
        return lado * lado;
    }

    /**
     * Metodo para Calcular a area do retangulo
     * @param lado1 lado maior
     * @param lado2 lado menor
     * @return retorna a ara
     */
    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    /**
     * Calcular a area do trapezio
     * @param baseMaior maior base
     * @param baseMenor menor base
     * @param altura altura do forma
     * @return retorna a area
     */
    public static double area(double baseMaior, double  baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
    }
    
}
