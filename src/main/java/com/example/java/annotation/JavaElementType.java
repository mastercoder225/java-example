package com.example.java.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@YourTypeAnnotation
public class JavaElementType {
    @YourFieldAnnotation
    private int myField;

    @YourTypeAnnotation
    @YourAnnotationTypeAnnotation
    @interface MyAnnotation {}

    @YourTypeAnnotation
    interface myInterface<@YourTypeParameterAnnotation T> {}

    @YourTypeAnnotation
    enum myEnum {A, B, C}

    @YourConstructorAnnotation
    public JavaElementType() {}

    @YourMethodAnnotation
    public void myMethod(@YourParameterAnnotation int myParameter)
            throws @YourTypeUseAnnotation Exception {
        @YourLocalVariableAnnotation
        int myLocalVariable = 1;

        @YourTypeUseAnnotation
        JavaElementType javaElementType = new JavaElementType();
    }

    public static void main(String[] args) {
        ElementType e0 = ElementType.ANNOTATION_TYPE;
        ElementType e1 = ElementType.CONSTRUCTOR;
        ElementType e2 = ElementType.FIELD;
        ElementType e3 = ElementType.LOCAL_VARIABLE;
        ElementType e4 = ElementType.METHOD;
        ElementType e5 = ElementType.PACKAGE;
        ElementType e6 = ElementType.PARAMETER;
        ElementType e7 = ElementType.TYPE;
        ElementType e8 = ElementType.TYPE_PARAMETER;
        ElementType e9 = ElementType.TYPE_USE;
    }
}

@Target(ElementType.ANNOTATION_TYPE) @interface YourAnnotationTypeAnnotation {}
@Target(ElementType.CONSTRUCTOR)     @interface YourConstructorAnnotation {}
@Target(ElementType.FIELD)           @interface YourFieldAnnotation {}
@Target(ElementType.LOCAL_VARIABLE)  @interface YourLocalVariableAnnotation {}
@Target(ElementType.METHOD)          @interface YourMethodAnnotation {}
@Target(ElementType.PACKAGE)         @interface YourPackageAnnotation {}
@Target(ElementType.PARAMETER)       @interface YourParameterAnnotation {}
@Target(ElementType.TYPE)            @interface YourTypeAnnotation {}
@Target(ElementType.TYPE_PARAMETER)  @interface YourTypeParameterAnnotation {}
@Target(ElementType.TYPE_USE)        @interface YourTypeUseAnnotation {}
