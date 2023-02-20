package models.animals.birds;

public class Сhicken extends NonFlyingBird
{
    public Сhicken(double height, double weight, String eyeColor, String feathersColor)
    {
        super(height, weight, eyeColor, feathersColor);
    }

    @Override
    public String sound()
    {
        return String.format("ко-ко-ко-ко-ко");
    }

    @Override
    public String toString()
    {
        return String.format("Курица (%s)", super.toString());
    }
}
