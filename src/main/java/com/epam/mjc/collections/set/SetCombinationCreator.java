package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
      Set<String> f = new HashSet<>(firstSet);
        Set<String> s = new HashSet<>(secondSet);
        Set<String> t = new HashSet<>(thirdSet);

        firstSet.retainAll(secondSet);
        firstSet.removeAll(thirdSet);

        t.removeAll(f);
        t.removeAll(s);

        t.addAll(firstSet);

        return t;
    }
}
