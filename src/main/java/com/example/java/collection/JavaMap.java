package com.example.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMap {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // add
        String value1 = map.put("key", "value");
        String value2 = map.putIfAbsent("key", "value");
        map.putAll(Collections.emptyMap());

        // get
        String value3 = map.get("key");
        String value4 = map.getOrDefault("key", "default");

        // view
        Set<String> keySet = map.keySet();
        Collection<String> values = map.values();
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // replace
        String value5 = map.replace("key", "value");
        boolean isReplace = map.replace("key", "oldValue", "newValue");
        map.replaceAll((k, v) -> v.toUpperCase());
        map.compute("key", (k, v) -> v.toUpperCase());
        map.computeIfAbsent("key", k -> "newValue" + k);
        map.computeIfPresent("key", (k, v) -> v.toUpperCase());
        String mergedValue = map.merge("key", "newValue", (oldValue, newValue) -> oldValue + newValue);

        // remove
        String removedString = map.remove("key");
        boolean isRemove = map.remove("key", "value");
        map.clear();

        // query
        int size = map.size();
        boolean isEmpty = map.isEmpty();
        boolean isContainsKey = map.containsKey("key");
        boolean isContainsValue = map.containsValue("value");

        map.forEach((k, v) -> System.out.println(k + v));
    }
}
