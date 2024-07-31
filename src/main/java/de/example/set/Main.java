package de.example.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);
        set.add(4);
        set.add(2); // Duplikat wird nicht eingefügt
        set.add(10);

        // prüfen, ob das Set leer ist
        System.out.println("Ist die Liste leer?:" + set.isEmpty());

        // Anzahl der inhaltenen Objekten anzeigen
        System.out.println("Wie viele Elemente sind enthalten:" + set.size());

        // das Set ausgeben
        System.out.println(set);

        // ein Object entfernen
        set.remove(10);

        // prüfen ob ein Objekt enthalten ist
        System.out.println("Enthält das Set die 10?: " + set.contains(10));


        // durch ein Set iterieren
        for(Integer num : set){
            System.out.println(num);
        }

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        set1.retainAll(set2);
        System.out.println(set1);
    }

}
