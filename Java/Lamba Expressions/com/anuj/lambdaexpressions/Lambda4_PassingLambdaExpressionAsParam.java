package com.anuj.lambdaexpressions;
interface MyLambda1{
    public void display();
}
interface MyLambda2{
    public void display();
}
class UseLambda{
    public void callLambda(MyLambda1 ml1, MyLambda2 ml2){
        ml1.display();
        ml2.display();
    }
}
class Demo1{
    public void method1(){
        UseLambda ul = new UseLambda();
//        ul.callLambda(()->{System.out.println("Hello bro!");}, ()->{System.out.println("Hi");});
        ul.callLambda(()->{}, ()->{});
    }

}
public class Lambda4_PassingLambdaExpressionAsParam {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        d.method1();
    }
}
