package de.example.set.checkDuplikate;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        int[] arr = {
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
                294861370
        };

        System.out.println(giveDuplikate(arr));

    }

    public static StringBuilder giveDuplikate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();
        sb.append("Länge des Arrays: " + arr.length + "\n");
        sb.append("Die Duplikate:");
        sb.append("\n");
        for (int num : arr) {
            if (!(set.add(num))) sb.append(num + "\n");

        }
        sb.append("Liste enthält nur eindeutige Elemente: " + (set.size() == arr.length));

        return sb;
    }
}
