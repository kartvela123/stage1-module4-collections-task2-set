package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> ha = new HashSet<>();
        List<Integer> newList = new ArrayList<>(sourceList);
        for (Integer a : sourceList) {
            if (!(a % 2 == 0)) {
                ha.add(a);
                ha.add(a*2);
            }else {
                int z = a;
                while (z % 2 == 0) {
                    ha.add(z);
                    z = z/2;
                    ha.add(z);

                }
            }
        }
        return ha;
    }
}
