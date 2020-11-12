package Obs;

public class Whip extends CondimentDecorator{
    Beverage beverage;
    public  Whip(Beverage beverage)
    {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",  добавка";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
