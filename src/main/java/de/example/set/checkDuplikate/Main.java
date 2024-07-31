package de.example.set.checkDuplikate;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(
                    105482960,
                    291736582,
                    374682491,
                    462839174,
                    520738460,
                    689047123,
                    798204685,
                    843920764,
                    910284736,
                    107346182,
                    219384657,
                    436829175,
                    436829175,
                    387295046,
                    508364729,
                    671092843,
                    671092843,
                    784529374,
                    784529374,
                    859734201,
                    859734201,
                    912846375,
                    103847562,
                    294861370));

        System.out.println(giveDuplikate(list));

        List<String> fighters = new ArrayList<>(List.of(
                "Sub-Zero",
                "Liu Kang",
                "Liu Kang",
                "Scorpion",
                "Raiden",
                "Johnny Cage",
                "Johnny Cage",
                "Jade",
                "Noob Saibot",
                "Kung Lao"));

        System.out.println(cleanList(fighters));
        System.out.println(cleanList(list));
    }

    public static <E> StringBuilder giveDuplikate(List<E> list) {
        Set<E> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append("Länge des Arrays: " + list.size() + "\n");
        sb.append("Die Duplikate:");
        sb.append("\n");
        for (E num : list) {
            if (!(set.add(num))) sb.append(num + "\n");

        }
        sb.append("Liste enthält nur eindeutige Elemente: " + (set.size() == list.size()));
        return sb;
    }

    public static <E> ArrayList<E> cleanList(List<E> list){
        return new ArrayList<>(new HashSet<>(list));
    }
}
