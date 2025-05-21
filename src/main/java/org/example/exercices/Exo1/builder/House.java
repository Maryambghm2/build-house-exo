package org.example.exercices.Exo1.builder;
// Exercice Design Pattern de type : Les creational patterns
// Créer classe House
public class House {
    private int nbFloor;
    private boolean havePool;
    private String roofing;
    private String color;

    // Créer constructeur House
    private House(Builder builder) {
        nbFloor = builder.nbFloor;
        havePool = builder.havePool;
        roofing = builder.roofing;
        color = builder.color;
    }

    // Créer sous classe house
    public static class Builder {
        private int nbFloor;
        private boolean havePool;
        private String roofing;
        private String color;

// Créer méthodes de la classe builder :

        public Builder nbFloor(int nbFloor) {
            this.nbFloor = nbFloor;
            return this;
        }

        public Builder havePool(boolean havePool) {
            this.havePool = havePool;
            return this;
        }

        public Builder roofing(String roofing) {
            this.roofing = roofing;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }


        public House build() {
            return new House(this);
        }
    }


    // Méthode ToString affichage
    @Override
    public String toString() {
        String completion = havePool ? " , have pool" : " , doesn't have pool";

        return "House{" +
                "nbFloor=" + nbFloor +
                completion +
                ", roofing='" + roofing + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
