package com.epam.mjc.collections.set;

import java.util.*;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> ari = new TreeSet<>();
        for (int i = 0; i < sourceList.size(); i++) {
            ari.add((int) Math.pow(sourceList.get(i), 2));
        }
        NavigableSet<Integer> res = ari.subSet(lowerBound, true, upperBound, true);
        return res;
    }
}
