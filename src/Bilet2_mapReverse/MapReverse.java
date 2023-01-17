package Bilet2_mapReverse;

import java.util.HashMap;
import java.util.Map;

public class MapReverse {
    public static Map<Integer, String> reverse(Map<String, Integer> q) {
        Map<Integer, String> reverseMap = new HashMap<>(); //создаем новый Map
        for (var a : q.entrySet()) { // проходим по элементам Mapа
            reverseMap.put(a.getValue(), a.getKey()); //добавляем значения в новый Мар
        }
        return reverseMap; // возвращаем новый Мар
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("qwe", 2);
        map.put("asd", 1);
        map.put("zxc", 1);
        map.put("fgh", 13);
        map.put("rty", 2);
        Map<Integer, String> newMap = reverse(map);
        System.out.println(newMap);
    }
}
