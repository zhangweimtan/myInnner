package com.myjava01;
/*
    成员内部类：看成一个类的成员
        在类的成员位置，和成员变量，成员方法所在的位置一样的
        在内部类，可以直接访问外部类的成员，包括私有成员


 */
public class InnerDemo {
    public static void main(String[] args) {
//        Outer out = new Outer();
//        out.method();
        Outer.Inner inn = new Outer().new Inner();
        inn.function();
    }
}
class Outer{
    private int num = 10;
    public void method(){
        Inner inn = new Inner();
        inn.function();
    }
    class Inner{
        public void function(){
            System.out.println(num);
        }
    }
}
