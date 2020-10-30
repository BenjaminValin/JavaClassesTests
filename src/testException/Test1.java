package testException;

public class Test1 {

    public static void main(String[] args) {
        System.out.println("Test1.main avant");
        fct1(6);
        System.out.println("Test1.main après");
    }

    private static void fct1(int i) {
        System.out.println("Test1.fct1 avant");
        try {                                                                           //Tente le code
            fct2(i);
            System.out.println("Test1.fct1 après appel fct2");
        } catch (IllegalArgumentException | MyException e){                             //A lieu si erreur IllegalArg... ou MyException
            System.out.println("Test1.fct1 dans le catch");
        //} catch (MyException e) {                                                     //A lieu si erreur MyException
        //    e.printStackTrace();
        } finally {                                                                     //A lieu dans tous les cas, même si un catch a été déclenché
            System.out.println("Test1.fct1 dans finally");
        }
        System.out.println("Test1.fct1 après");
    }

    private static void fct2(int i) throws MyException {
        System.out.println("Test1.fct2 avant");
        fct3(i);
        System.out.println("Test1.fct2 après");
    }

    private static void fct3(int i) throws MyException {
        System.out.println("Test1.fct3 avant");
        if (i == 5){
            throw new IllegalArgumentException("Ne pas entrer la valeur 5 SVP");
        } else if (i == 6){
            throw new NullPointerException("C'est nul");
        } else if (i == 7){
            throw new MyException("Coucou");
        }
        System.out.println("Test1.fct3 après");
    }
}
