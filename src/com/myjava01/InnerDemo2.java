package com.myjava01;
/*
    成员内部类修饰符：
        我们可以使用权限修饰符，修饰成员内部类，如果使用私有private来修饰，则无法再其他类中无法访问
        可以使用static修饰内部类，不用再创建外部类的对象

    还可以使用abstract final修饰，场景少；

 */
public class InnerDemo2 {
    public static void main(String[] args) {

    }
}

class Outer2{
    public void method(){

    }

    class Inner2{
        public void function(){
            System.out.println("function");
        }
    }
}
