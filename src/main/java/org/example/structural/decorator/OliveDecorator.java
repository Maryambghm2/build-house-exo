package org.example.structural.decorator;

// Decorateur pour mes pizzas (ajoute des olives ) basé sur mon decorator pizza abstrait
public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", avec Olive";
    }

    public double getCost() {
        return super.getCost() + 0.75;
    }
}
