package org.example.Exo1.builder;

public class House {
    private int nbFloor;
    private boolean havePool;
    private String roofing;
    private String color;

    private House(Builder builder) {
        nbFloor = builder.nbFloor;
        havePool = builder.havePool;
        roofing = builder.roofing;
        color = builder.color;
    }

    public static class Builder {
        private int nbFloor;
        private boolean havePool;
        private String roofing;
        private String color;


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
