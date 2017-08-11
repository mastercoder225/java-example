package com.example.java.jvm;

/**
 * Created by zhangjian on 2017/8/11.
 */
public class JvmFrames {

    public static void main(String[] args) {
        // usage
        // 1. store data
        // 2. store partial result
        // 3. perform dynamic linking
        // 4. return values for methods
        // 5. dispatch exceptions

        // contains
        // 1. an array of local variables
        // 2. operand stack
        // 3. reference to the runtime constant pool of the class of the current method

//        // Only one frame, the frame for the executing method, is active at any point in a given
//        thread of control. This frame is referred to as the current frame, and its method is
//        known as the current method. The class in which the current method is defined is
//                the current class.

        // A new frame is created each time a method is invoked.
        // A frame is destroyed when its method invocation completes, whether that completion is normal or abrupt
    }
}
