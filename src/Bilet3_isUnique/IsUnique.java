package Bilet3_isUnique;

import java.util.HashMap;
import java.util.Map;

public class IsUnique {
    public static boolean isUnique(Map<String, String> map) {
        for (String str1 : map.values()) {
            int count = 0;
            for (String str2 : map.values()) {
                if (str1.equals(str2)) {
                    count++;
                }
            }
            if (count > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Map<String, String> a = new HashMap<>();
        a.put("Marty", "Step");
        a.put("Stuart", "Reges");
        a.put("Jesica", "Miller");
        a.put("Amanda", "Camp");
        a.put("Hal", "Perkins");
        System.out.println(isUnique(a));
        Map<String, String> b = new HashMap<>();
        b.put("Kendrik", "Perkins");
        b.put("Stuart", "Reges");
        b.put("Jesica", "Miller");
        b.put("Bruce", "Reges");
        b.put("Hal", "Perkins");
        System.out.println(isUnique(b));
    }
}
