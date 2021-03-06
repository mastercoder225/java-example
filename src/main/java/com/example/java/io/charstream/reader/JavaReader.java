package com.example.java.io.charstream.reader;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class JavaReader {

    public static void main(String[] args) throws IOException {
        Reader reader = new StringReader("This is a long string.");

        char c = (char) reader.read(); // 'T'

        char[] b1 = new char[5];
        int s1 = reader.read(b1); // ['h', 'i', 's', ' ', 'i']

        char[] b2 = new char[5];
        int s2 = reader.read(b2, 2, 3); // ['\u0000  ', '\u0000', 's', ' ', 'a']

        long n = reader.skip(2);

        reader.reset();
        reader.close();
    }
}
