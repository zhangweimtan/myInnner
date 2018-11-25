package com.myjava04;
/*
    匿名内部类的使用场景:
        作为参数进行传递,使用一次
 */
public class InnerDemo5 {
    public static void main(String[] args) {
//        method(new Dog());
//        method(new Cat());
        new Animal(){

            @Override
            public void eat() {
                System.out.println("猫吃鱼");
            }
        };
//        method();
    }
    public static void method(Animal a){
        a.eat();
    }
}
