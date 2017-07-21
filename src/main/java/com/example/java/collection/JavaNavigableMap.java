package com.example.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaNavigableMap {

    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        // add
        String value1 = navigableMap.put("key", "value");
        String value2 = navigableMap.putIfAbsent("key", "value");
        navigableMap.putAll(Collections.emptyMap());

        // get key
        String ceilingKey = navigableMap.ceilingKey("key");
        String firstKey = navigableMap.firstKey();
        String lastKey = navigableMap.lastKey();
        String floorKey = navigableMap.floorKey("key");
        String higherKey = navigableMap.higherKey("key");
        String lowerKey = navigableMap.lowerKey("key");

        // get value
        String value3 = navigableMap.get("key");
        String value4 = navigableMap.getOrDefault("key", "default");

        // get entry
        Map.Entry<String, String> ceilingEntry = navigableMap.ceilingEntry("key");
        Map.Entry<String, String> firstEntry = navigableMap.firstEntry();
        Map.Entry<String, String> lastEntry = navigableMap.lastEntry();
        Map.Entry<String, String> floorEntry = navigableMap.floorEntry("key");
        Map.Entry<String, String> higherEntry = navigableMap.higherEntry("key");
        Map.Entry<String, String> lowerEntry = navigableMap.lowerEntry("key");

        // view
        NavigableMap<String, String> headMap1 = navigableMap.headMap("toKey", true); // <= toKey
        SortedMap<String, String> headMap2 = navigableMap.headMap("toKey"); // < toKey
        NavigableMap<String, String> tailMap1 = navigableMap.tailMap("fromKey", false); // > fromKey
        SortedMap<String, String> tailMap2 = navigableMap.tailMap("fromKey"); // >= fromKey
        NavigableMap<String, String> subMap1 = navigableMap.subMap("fromKey", false, "toKey", true); // (fromKey, toKey]
        SortedMap<String, String> subMap2 = navigableMap.subMap("fromKey", "toKey"); // [fromKey, toKey)
        Set<String> keySet = navigableMap.keySet();
        NavigableSet<String> navigableKeySet = navigableMap.navigableKeySet();
        Set<String> descendingKeySet = navigableMap.descendingKeySet();
        Collection<String> values = navigableMap.values();
        Set<Map.Entry<String, String>> entrySet = navigableMap.entrySet();
        NavigableMap<String, String> descendingMap = navigableMap.descendingMap();

        // replace
        String value5 = navigableMap.replace("key", "value");
        boolean isReplace = navigableMap.replace("key", "oldValue", "newValue");
        navigableMap.replaceAll((k, v) -> v.toUpperCase());
        navigableMap.compute("key", (k, v) -> v.toUpperCase());
        navigableMap.computeIfAbsent("key", k -> "newValue" + k);
        navigableMap.computeIfPresent("key", (k, v) -> v.toUpperCase());
        String mergedValue = navigableMap.merge("key", "newValue", (oldValue, newValue) -> oldValue + newValue);

        // remove
        Map.Entry<String, String> pollFirstEntry = navigableMap.pollFirstEntry();
        Map.Entry<String, String> pollLastEntry = navigableMap.pollLastEntry();
        String removedString = navigableMap.remove("key");
        boolean isRemove = navigableMap.remove("key", "value");
        navigableMap.clear();

        // query
        int size = navigableMap.size();
        boolean isEmpty = navigableMap.isEmpty();
        boolean isContainsKey = navigableMap.containsKey("key");
        boolean isContainsValue = navigableMap.containsValue("value");

        // transform
        Comparator<? super String> comparator = navigableMap.comparator();

        navigableMap.forEach((k, v) -> System.out.println(k + v));
    }
}
