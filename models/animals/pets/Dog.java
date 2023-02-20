package models.animals.pets;

import java.util.Date;
import java.util.List;

import models.interfaces.Trainer;

public class Dog extends Pet implements Trainer
{
    protected boolean trained;

    public Dog(double height, double weight, String eyeColor, String name, String breed,
            List<String> vaccinations, String furColor, Date birdhDate, boolean trained)
    {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = trained;
    }
    
    public Dog(double height, double weight, String eyeColor, String name, String breed,
            List<String> vaccinations, String furColor, Date birdhDate)
    {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birdhDate);
        this.trained = false;
    }

    public boolean isTrained()
    {
        return this.trained;
    }
    
    @Override
    public String train()
    {
        this.trained = true;
        return String.format("Собака %s была успешно обучена\n", this.getName());
    }

    @Override
    public String sound()
    {
        return "Гав-гав!";
    }
    
    @Override
    public String toString()
    {
        return String.format("Собака (%s, обучен: %b)", super.toString(), this.isTrained());
    }
}