package com.example.json.gson;

import com.google.gson.Gson;

public class JavaGson {

    private static class Person {
        private String name = "Alex";
        private String sex = "male";
        private transient int age = 25;
    }

    public static void main(String[] args) {
        Gson gson = new Gson();

        // Serialization
        gson.toJson("Hello World!"); // "Hello World!"
        gson.toJson(1); // 1
        gson.toJson(0.06); // 0.06
        gson.toJson(0.05 + 0.01); // 0.060000000000000005
        gson.toJson(Boolean.FALSE); // false
        gson.toJson(null); // null
        gson.toJson(new int[] {1, 2, 3, 4, 5}); // [1,2,3,4,5]
        gson.toJson(new Person()); // {"name":"Alex","sex":"male"}

        // Deserialization
        String a = gson.fromJson("\"Hello World!\"", String.class);
        int b = gson.fromJson("1", int.class);
        Integer c = gson.fromJson("1", Integer.class);
        int[] d = gson.fromJson("[1,2,3,4,5]", int[].class);
        Person e = gson.fromJson("{\"name\":\"Alex\",\"sex\":\"male\"}", Person.class);

        System.out.println(e.name);
    }
}
