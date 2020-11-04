package javaConstructeur;

public class TestConstucteur {

    public static void main(String[] args) {                    //A tester avec debug, et flèches descendantes pour voir le cheminement
        new Desc();
        Desc d = null;
        try {
            d = new Desc(null);
        } catch (Exception e ) {
            System.out.println("TestConstucteur.main");
        }
    }
}
