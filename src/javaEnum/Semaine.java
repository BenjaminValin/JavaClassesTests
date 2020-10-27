package javaEnum;

public enum Semaine {
    LUNDI(8), MARDI(8), MERCREDI(8), JEUDI(8), VENDREDI(7), SAMEDI(0), DIMANCHE(0)
    ;
    private int nbHeures;

    private Semaine(int nb){                                            //Les constructeurs d'ENUM sont toujours private
        this.nbHeures = nb;
    }

    public int getNbHeures() {
        return nbHeures;
    }
}
