package org.example.structural.decorator;

// Décorateur pour mes pizzas (ajouter du fromage) basé sur mon decorator pizza abstrait
public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + " , au Fromage.";
    }

    public double getCost() {
        return super.getCost() + 1.50;
    }
}
