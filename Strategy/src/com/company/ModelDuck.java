package com.company;

public class ModelDuck extends Duck{

    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quckBehavior = new Quack();
    }

    public void display() {
        System.out.println(" Я - утка - обманка");
    }
}
