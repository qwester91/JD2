package by.it_academy.jd2.sorts.service.comparators;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<Map.Entry<Integer, Integer>> {
    @Override
    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {

        return o1.getValue() - o2.getValue();
    }
}

