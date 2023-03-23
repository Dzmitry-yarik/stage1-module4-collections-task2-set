package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
     HashSet<Integer> inter = new HashSet<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) % 2 == 0) {
                inter.add(sourceList.get(i));
                int a = sourceList.get(i) / 2;
                inter.add(a);
                while (a % 2 == 0) {
                    a = a / 2;
                    inter.add(a);
                }
            } else {
                inter.add(sourceList.get(i));
                int b = sourceList.get(i) * 2;
                inter.add(b);
            }
        }

        return inter;
    }
}
