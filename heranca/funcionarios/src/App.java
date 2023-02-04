public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();

        //upcast
        Funcionario faxineiro = new Faxineiro();
        Funcionario gerente = new Gerente();
        Funcionario  vendedor = new Faxineiro();

        //downcast
        Vendedor vendedor2 = (Vendedor) new Funcionario();

    }
}
