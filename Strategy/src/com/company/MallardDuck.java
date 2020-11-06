package com.company;

public class MallardDuck extends Duck{
    public MallardDuck()
    {
        // переменные наследуются от Дак
        flyBehavior = new FlyWithWings();
        quckBehavior = new Quack();
    }
    public void display()
    {
        System.out.println("я реально кряква!!");
    }
}
