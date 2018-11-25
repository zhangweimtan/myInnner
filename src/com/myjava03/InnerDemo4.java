package com.myjava03;
/*
    匿名内部类：
        可以把匿名内部类看成一个没有名字的局部内部类
        定义在方法当中
        必须在定义匿名内部类的时候创建他的对象

    格式：
        new 类/接口(){
            如果是创建了继承这个类的子类对象，我们可以重写父类的方法
            如果是创建了实现这个接口的子类对象，我们必须要实现该接口的也有方法
        };

    原理：
        创建了继承这个类的子类对象或者创建了实现这个接口的子类对象
 */
public class InnerDemo4 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();
    }
}

interface Inner{
    public void function();
}
class Outer{
    public void method(){
        Inner i = new Inner(){

            @Override
            public void function() {
                System.out.println("function");
            }
        };
        i.function();
    }
}
