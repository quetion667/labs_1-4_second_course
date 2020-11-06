package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Это утиный симулятор");

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("Теперь создадим утку на реактивнйо тяге!");

        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
