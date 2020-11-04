package javaConstructeur;

public class Desc extends Anc {

    private String name = null;
    //private int error = 5;

    public Desc(){
        this("toto");
    }

    public Desc(String name) {
        //super(this.error);                                        //this ne peut être appelé, car il est créé plus tard
        //this();                                                   //idem
        super();                                                    //Pas obligatoire
        if(name == null){
            throw new NullPointerException("Le nom ne peut pas être null");
        }
        this.name = name;
    }

    @Override
    public void test(){
        super.test();
    }
}
