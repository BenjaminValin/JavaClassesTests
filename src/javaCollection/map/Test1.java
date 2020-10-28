package javaCollection.map;

import javaCollection.set.Position;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test1 {

    public static void main(String[] args) {
        Map<String, Position> maMap = new HashMap<>();

        maMap.put("A1",new Position(0,0));
        maMap.put("A2",new Position(0,1));
        maMap.put("B1",new Position(1,1));
        maMap.put("B1",new Position(1,0));
        maMap.put("A3",null);

        System.out.println(maMap.size());
        System.out.println(maMap.isEmpty());
        System.out.println(maMap.get("B1"));
        System.out.println(maMap.get("A3"));

        System.out.println(maMap.containsKey("A3"));                                        //Permet de voir si une clé est bien contenue dans la map
        System.out.println(maMap.containsValue(new Position(1,1)));             //Permet de voir si la valeur est bien contenue dans la map (ne marche que si equals() et hashCode() ont été redéfinis)
        System.out.println(maMap.containsValue(new Position(1,0)));

        for(String s : maMap.keySet()){                                                     //Donne les clés de la map (ici les strings A1, A2,...)
            System.out.println(s);
        }

        //OU

        Iterator<String> iterator = maMap.keySet().iterator();                              //Ancienne méthode pour boucler sur les clés
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }

        for(Position p : maMap.values()){                                                   //Donne les valeurs de la map (ici les positions)
            System.out.println(p);
        }

        //ou

        Iterator<Position> iterator2 = maMap.values().iterator();                           //Ancienne méthode pour boucler sur les valeurs, et se stoppe dès qu'il arrive en colonne 1
        int col = 0;
        while (iterator2.hasNext() && col == 0){
            Position p = iterator2.next();
            col = p.getColumn();
            System.out.println(p);
        }

        for(Map.Entry e : maMap.entrySet()){                                                //Affiche les correspondances clé=valeur
            System.out.println(e);
        }

        for(Map.Entry f : maMap.entrySet()){                                                //Affiche la clé, puis sa valeur
            System.out.println(f.getKey());
            System.out.println(f.getValue());
        }
    }
}
