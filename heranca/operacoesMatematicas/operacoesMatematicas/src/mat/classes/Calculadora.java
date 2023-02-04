package mat.classes;
import mat.interfaces.OperacaoMatematica;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(operando1+operando2);
        
    }

    @Override
    public void subtracao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(operando1-operando2);
        
    }

    @Override
    public void multiplicacao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(operando1*operando2);
        
    }

    @Override
    public void divisao(double operando1, double operando2) {
        // TODO Auto-generated method stub
        System.out.println(operando1/operando2);
        
    }
    
}
