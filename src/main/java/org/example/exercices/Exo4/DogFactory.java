package org.example.exercices.Exo4;

public class DogFactory extends AnimalFactory
{
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
