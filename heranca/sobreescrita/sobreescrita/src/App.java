public class App {
    public static void main(String[] args) throws Exception {
        // poliformismo 
        ClasseMae[] classes = new ClasseMae[]{new ClasseFillha1(), new ClasseFillha2(), new ClasseMae()};


        for (ClasseMae classe : classes) {
            classe.metodo1();
            
        }

        //sobreescrita
        ClasseFillha1 classeFillha1a = new ClasseFillha1();

        classeFillha1a.metodo1();
        
    }
}
