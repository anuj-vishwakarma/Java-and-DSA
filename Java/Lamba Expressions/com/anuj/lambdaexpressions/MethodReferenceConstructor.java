package com.anuj.lambdaexpressions;

import java.sql.SQLOutput;

interface MyLambda4{
    public void display(String str);
}
class MyClass {
    MyClass(String s){
        System.out.println(s.toUpperCase());
    }
}

public class MethodReferenceConstructor {
    public static void main(String[] args) {
        MyLambda4 ml = MyClass::new;
        ml.display("Hi");
        ml.display("Hieelee");
    }
}
