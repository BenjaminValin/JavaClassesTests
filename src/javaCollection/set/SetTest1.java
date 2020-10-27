package javaCollection.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest1 {

    public static void main(String[] args) {

        Position position1 = new Position(3, 4);
        Position position2 = new Position(3, 4);
        System.out.println("Hashcode objet 1 : " + position1.hashCode());
        System.out.println("Hashcode objet 2 : " + position2.hashCode());

        Set<Position> monSet = new HashSet<>();                                     //Set est générique, car on le force à accepter un seul type d'objet

        System.out.println("Egalité : " + position1.equals(position2));
        System.out.println("Egalité : " + (position1 == position2));

        System.out.println("Ajout de l'objet 1 : " + monSet.add(position1));
        System.out.println("Ajout de l'objet 2 : " + monSet.add(position2));
        //System.out.println("Ajout de l'objet 3 : " + monSet.add("toto"));         //Impossible, car le set demande des Position, et "toto" est un String
        System.out.println("Taille de la collection : " + monSet.size());
    }
}
