package com.example.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
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

        // get
        String firstKey = navigableMap.firstKey();
        String lastKey = navigableMap.lastKey();
        String value3 = navigableMap.get("key");
        String value4 = navigableMap.getOrDefault("key", "default");

        // view
        SortedMap<String, String> headMap = navigableMap.headMap("toKey"); // < toKey
        SortedMap<String, String> tailMap = navigableMap.tailMap("fromKey"); // >= fromKey
        SortedMap<String, String> subMap = navigableMap.subMap("fromKey", "toKey"); // [fromKey, toKey)
        Set<String> keySet = navigableMap.keySet();
        Collection<String> values = navigableMap.values();
        Set<Map.Entry<String, String>> entrySet = navigableMap.entrySet();

        // replace
        String value5 = navigableMap.replace("key", "value");
        boolean isReplace = navigableMap.replace("key", "oldValue", "newValue");
        navigableMap.replaceAll((k, v) -> v.toUpperCase());
        navigableMap.compute("key", (k, v) -> v.toUpperCase());
        navigableMap.computeIfAbsent("key", k -> "newValue" + k);
        navigableMap.computeIfPresent("key", (k, v) -> v.toUpperCase());
        String mergedValue = navigableMap.merge("key", "newValue", (oldValue, newValue) -> oldValue + newValue);

        // remove
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
