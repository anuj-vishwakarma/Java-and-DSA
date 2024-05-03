package com.anuj.lambdaexpressions;
interface MyLambda{
    public void display();
}
class Demo {
    int x = 0;

    public void method1(){
        int count = 0;
        MyLambda ml = () -> {
            System.out.println("Hi ");
            System.out.println("Bye!" + count);
        };
        ml.display();
    }
}
public class Lambda3_CaptureInLambda {
    public static void main(String[] args) {

    }
}
