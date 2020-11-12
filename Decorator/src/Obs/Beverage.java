package Obs;

public abstract class Beverage {
    String description = "неизвестное поведение";

    public String getDescription() {
        return description;
    }
    public abstract  double cost();
}
