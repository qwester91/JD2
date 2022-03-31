package by.it_academy.jd2.sorts;

import by.it_academy.jd2.sorts.Comparators.MapComparator;
import by.it_academy.jd2.sorts.Comparators.MapComparatorInfo;

import java.util.*;

public class SortsInfo {

        public List<Map.Entry<String, Long>> sortMap(Map<String, Long> choose) {

            List<Map.Entry<String, Long>> entries = new ArrayList<>(choose.entrySet());

            Comparator<Map.Entry<String, Long>> comparator = new MapComparatorInfo();
            Comparator<Map.Entry<String, Long>> reversed = comparator.reversed();
            entries.sort(reversed);
            return entries;
        }
}