package exercise;

import java.util.*;

// BEGIN
class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Set<String> k1 = new TreeSet<>(data1.keySet());
        Set<String> k2 = new TreeSet<>(data2.keySet());
        LinkedHashMap<String, String> result = new LinkedHashMap<>();

        Set<String> kAll = new TreeSet<>();

        kAll.addAll(k1);
        kAll.addAll(k2);

        Set<String> added = new TreeSet<>();

        added.addAll(kAll);
        added.removeAll(k1);

        for (String a : added) {
            result.put(a, "added");
        }

        Set<String> deleted = new TreeSet<>();

        deleted.addAll(kAll);
        deleted.removeAll(k2);

        for (String d : deleted) {
            result.put(d, "deleted");
        }

        Set<String> changed = new TreeSet<>();

        changed.addAll(kAll);
        changed.retainAll(k1);
        changed.retainAll(k2);

        for (String c : changed) {
            if (data1.get(c).equals(data2.get(c))) {
                result.put(c, "unchanged");
            } else {
                result.put(c, "changed");
            }
        }
        return result;
    }
}
//END
