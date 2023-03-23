package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        
     Set<Integer> inter = new HashSet<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if (sourceList.get(i) < 0) {
                int a = sourceList.get(i) * -1;
                int s = a * a;
                if (s >= lowerBound && s <= upperBound) {
                    inter.add(s);
                }
            } else {
                int s = sourceList.get(i) * sourceList.get(i);
                if (s >= lowerBound && s <= upperBound) {
                    inter.add(s);
                }
            }

        }

        return inter;
    }
}
