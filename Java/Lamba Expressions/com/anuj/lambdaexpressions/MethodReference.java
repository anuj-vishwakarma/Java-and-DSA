package com.anuj.lambdaexpressions;
@FunctionalInterface
interface MyLambda3{
    public void display(String str);
}

public class MethodReference {

    public static void reverse(String str){
        StringBuffer s = new StringBuffer(str);
        s.reverse();
        System.out.println(s);
    }

    public static void main(String[] args) {
        // MyLambda3 ml = System.out::println;
        // ml.display("Hi");

        MyLambda3 ml = MethodReference::reverse;
        ml.display("Hello");
    }
}