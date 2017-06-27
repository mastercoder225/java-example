package com.example.java.io;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class JavaFile {

    public static void main(String[] args) throws IOException, URISyntaxException {
        File f1 = new File("file.txt");
        File f2 = new File("dir");
        File f3 = new File("dir/file.txt");
        File f4 = new File("dir/sub");
        File f5 = new File("dir/sub", "file.txt");
        File f6 = new File(f4, "demo.txt");
        File f7 = new File("/tmp/file.txt");
        File f8 = new File(new URI("file:/tmp/demo.txt"));

        boolean c1 = f1.createNewFile();
        boolean c2 = f2.mkdir();
        boolean c3 = f3.createNewFile();
        boolean c4 = f4.mkdirs();
        boolean c5 = f5.createNewFile();
        boolean c6 = f6.createNewFile();
        boolean c7 = f7.createNewFile();
        boolean c8 = f8.createNewFile();

        boolean d8 = f8.delete();
        boolean d7 = f7.delete();
        boolean d6 = f6.delete();
        boolean d5 = f5.delete();
        boolean d4 = f4.delete();
        boolean d3 = f3.delete();
        boolean d2 = f2.delete();
        boolean d1 = f1.delete();

        File file = new File("file.txt");

        boolean b1 = file.exists();
        boolean b2 = file.isFile();
        boolean b3 = file.isDirectory();
        boolean b4 = file.isAbsolute();
        boolean b5 = file.isHidden();
        boolean b6 = file.canRead();
        boolean b7 = file.canWrite();
        boolean b8 = file.canExecute();

        file.deleteOnExit();
    }
}





