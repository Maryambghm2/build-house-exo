package org.example.Exo1;

import org.example.Exo1.builder.House;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder().nbFloor(4).build();
        House house1 = new House.Builder().nbFloor(10).build();
        System.out.println(house);
        System.out.println(house1);

        House house2 = new House.Builder()
                .color("Red")
                .havePool(true)
                .nbFloor(7)
                .roofing("Bois")
                .build();
        System.out.println(house2);
    }
}
