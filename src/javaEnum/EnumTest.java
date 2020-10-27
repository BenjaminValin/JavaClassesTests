package javaEnum;

import java.util.Arrays;

public class EnumTest {

    public static void main(String[] args) {
        Semaine jour;
        jour = Semaine.MARDI;
        Semaine rendezVous;
        rendezVous = Semaine.JEUDI;

        if (jour == rendezVous){
            System.out.println("C'est aujourd'hui le rendez-vous");
        } else {
            System.out.println("Pas de rendez-vous aujourd'hui");
        }

        rendezVous = Semaine.valueOf("VENDREDI");
        Semaine[] values = Semaine.values();                                    // Crée un tableau contenant les données de l'ENUM
        System.out.println(Semaine.values()[1]);                                // Donne l'entrée du tableau à l'indice 1
        System.out.println(values.length);                                      // Donne la longueur du tableau = 7
        System.out.println(Arrays.toString(values));                            // Donne la liste des données du tableau
        int ordinal = jour.ordinal();
        System.out.println("position de " + jour + " est " + ordinal);          // Mardi est à l'indice 1 dans le tableau
        int compare = jour.compareTo(rendezVous);                               // Compare la position de rendezVous(Vendredi) par rapport à la position de jour(mardi), 3 positions d'écart en négatif
        System.out.println(compare);
        System.out.println(rendezVous.getNbHeures());                           // Donne le nombre d'heures du vendredi
    }
}
