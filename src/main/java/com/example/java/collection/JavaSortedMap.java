package com.example.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaSortedMap {

    public static void main(String[] args) {
        SortedMap<String, String> sortedMap = new TreeMap<>();

        // add
        String value1 = sortedMap.put("key", "value");
        String value2 = sortedMap.putIfAbsent("key", "value");
        sortedMap.putAll(Collections.emptyMap());

        // get
        String firstKey = sortedMap.firstKey();
        String lastKey = sortedMap.lastKey();
        String value3 = sortedMap.get("key");
        String value4 = sortedMap.getOrDefault("key", "default");

        // view
        SortedMap<String, String> headMap = sortedMap.headMap("toKey"); // < toKey
        SortedMap<String, String> tailMap = sortedMap.tailMap("fromKey"); // >= fromKey
        SortedMap<String, String> subMap = sortedMap.subMap("fromKey", "toKey"); // [fromKey, toKey)
        Set<String> keySet = sortedMap.keySet();
        Collection<String> values = sortedMap.values();
        Set<Map.Entry<String, String>> entrySet = sortedMap.entrySet();

        // replace
        String value5 = sortedMap.replace("key", "value");
        boolean isReplace = sortedMap.replace("key", "oldValue", "newValue");
        sortedMap.replaceAll((k, v) -> v.toUpperCase());
        sortedMap.compute("key", (k, v) -> v.toUpperCase());
        sortedMap.computeIfAbsent("key", k -> "newValue" + k);
        sortedMap.computeIfPresent("key", (k, v) -> v.toUpperCase());
        String mergedValue = sortedMap.merge("key", "newValue", (oldValue, newValue) -> oldValue + newValue);

        // remove
        String removedString = sortedMap.remove("key");
        boolean isRemove = sortedMap.remove("key", "value");
        sortedMap.clear();

        // query
        int size = sortedMap.size();
        boolean isEmpty = sortedMap.isEmpty();
        boolean isContainsKey = sortedMap.containsKey("key");
        boolean isContainsValue = sortedMap.containsValue("value");

        // transform
        Comparator<? super String> comparator = sortedMap.comparator();

        sortedMap.forEach((k, v) -> System.out.println(k + v));
    }
}
