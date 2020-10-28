package javaCollection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorTest {
    public static void main(String[] args) {
        HashSet<Position> positions = new LinkedHashSet<>();

        for (int i = 0; i < 4; i++) {
            positions.add(new Position(i,0));
        }

        for(Position p : positions){
            System.out.println(p);
        }
        System.out.println();                                                                       //Ne modifie que la copie de Positions
        for(Position p : positions){
            p = new Position(p.getLine()+1,p.getColumn()+1);
            System.out.println(p);
        }
        System.out.println();
        for(Position p : positions){
            System.out.println(p);
        }
        System.out.println();                                                                       //Modifie la copie de Positions et l'original(ils ont la même adresse)
        for(Position p : positions){
            p.setColumn(p.getColumn()+1);
            System.out.println(p);
        }
        System.out.println();
        for(Position p : positions){
            System.out.println(p);
        }

        /*while(positions.iterator().hasNext()){                                                      //Crée un iterator en première position en boucle
            System.out.println(positions.iterator().next());
        }*/

        Iterator<Position> iterator = positions.iterator();                                         //Crée un iterator unique en première position qui se stoppe après avoir tout balayé
        while(positions.iterator().hasNext()){
            System.out.println(positions.iterator().next());
        }
    }
}
