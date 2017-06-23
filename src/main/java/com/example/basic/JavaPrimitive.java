package com.example.basic;

public class JavaPrimitive {

    public static void main(String[] args) {
        byte    a1 = 1;    // SIZE=8  BYTES=1 MIN=-128 MAX=127
        short   a2 = 1;    // SIZE=16 BYTES=2 MIN=-32768 MAX=32767
        int     a3 = 1;    // SIZE=32 BYTES=4 MIN=-2147483648 MAX=2147483647
        long    a4 = 1L;   // SIZE=64 BYTES=8 MIN=-9223372036854775808 MAX=9223372036854775807
        float   a5 = 1.0F; // SIZE=32 BYTES=4
        double  a6 = 1.0;  // SIZE=64 BYTES=8
        boolean a7 = true; // true|false
        char    a8 = 'A';  // SIZE=16 BYTES=2 MIN='\u0000' MAX='\uffff'
    }
}
