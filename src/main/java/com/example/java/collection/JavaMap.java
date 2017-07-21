package com.example.java.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaMap {

    public static void main(String[] args) {
        Map<Character, Character> map = new HashMap<>();

        // add
        Character value1 = map.put('K', 'V');
        Character value2 = map.putIfAbsent('K', 'V');
        map.putAll(Collections.emptyMap());

        // get
        Character value3 = map.get('K');
        Character value4 = map.getOrDefault('K', 'X');

        // view
        Set<Character> keySet = map.keySet();
        Collection<Character> values = map.values();
        Set<Map.Entry<Character, Character>> entrySet = map.entrySet();

        // replace
        map.compute('K', (k, v) -> Character.toUpperCase(v));
        map.computeIfAbsent('K', Character::toUpperCase);
        map.computeIfPresent('K', (k, v) -> Character.toUpperCase(v));
        Character newValue1 = map.merge('K', 'N', (oldValue, newValue) -> Character.toUpperCase(newValue));
        Character value = map.replace('K', 'V');
        boolean isReplace = map.replace('K', 'O', 'N');
        map.replaceAll((k, v) -> Character.toUpperCase(v));

        // query
        int size = map.size();
        boolean isEmpty = map.isEmpty();
        boolean isContainsKey = map.containsKey('K');
        boolean isContainsValue = map.containsValue('V');

        // remove
        Character removedCharacter = map.remove('K');
        boolean isRemove = map.remove('K', 'V');
        map.clear();

        map.forEach((k, v) -> System.out.println(k + v));
    }
}
