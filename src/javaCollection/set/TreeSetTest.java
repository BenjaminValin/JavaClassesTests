package javaCollection.set;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String[] args) {

        //Tri ordinaire
        SortedSet<Position> positions = new TreeSet<>();

        positions.add(new Position(1,2));
        positions.add(new Position(2,3));
        positions.add(new Position(2,8));
        positions.add(new Position(3,0));
        positions.add(new Position(2,2));
        positions.add(new Position(1,2));
        positions.add(new Position(1,8));
        positions.add(new Position(4,8));

        System.out.println("Tri classique");
        for (Position p : positions){                                           //Tri du plus petit au plus grand
            System.out.println(p);
        }

        //Tri en utilisant une redéfinition du tri par une autre classe
        TreeSet<Position> posit = new TreeSet<>(new MyComparator());

        posit.add(new Position(1,2));
        posit.add(new Position(2,3));
        posit.add(new Position(2,8));
        posit.add(new Position(3,0));
        posit.add(new Position(2,2));
        posit.add(new Position(1,2));
        posit.add(new Position(1,8));
        posit.add(new Position(4,8));

        System.out.println();
        System.out.println("Tri selon la redéfinition du Comparator");
        for (Position p : posit){                                           //Tri selon la méthode Comparator de la classe MyComparator
            System.out.println(p);
        }

        //Idem seconde option, mais via programmation fonctionnelle et expressions lambda
        TreeSet<Position> pos = new TreeSet<>(getMyComparator());

        pos.add(new Position(1,2));
        pos.add(new Position(2,3));
        pos.add(new Position(2,8));
        pos.add(new Position(3,0));
        pos.add(new Position(2,2));
        pos.add(new Position(1,2));
        pos.add(new Position(1,8));
        pos.add(new Position(4,8));

        System.out.println();
        System.out.println("Tri selon la redéfinition du Comparator");
        for (Position p : pos){                                           //Tri selon la méthode Comparator de la classe MyComparator
            System.out.println(p);
        }
    }

    private static Comparator<Position> getMyComparator() {
        return (o1, o2) -> o1.getColumn() - o2.getColumn() == 0 ? o1.getLine() - o2.getLine() : o1.getColumn() - o2.getColumn();
    }

    /*private static Comparator<Position> getMyComparator() {
        return (o1, o2) -> {
            int compare = 0;
            compare =  o1.getColumn() - o2.getColumn();
            if (compare == 0){
                compare = o1.getLine() - o2.getLine();
            }
            return compare;
        };
    }*/

    /*private static Comparator<Position> getMyComparator() {
        //Classe anonyme interne
        return new Comparator<Position>() {
            @Override
            public int compare(Position o1, Position o2) {
                int compare = 0;
                compare =  o1.getColumn() - o2.getColumn();
                if (compare == 0){
                    compare = o1.getLine() - o2.getLine();
                }
                return compare;
            }
        };
    }*/



}
