package Obs;

public class HouseBlend extends Beverage{
    public HouseBlend()
    {
        description = "Домащнее кофе";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
