package odev5;

import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants  = new ArrayList<Plant>();
    
    void simulateDay() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("DAY: " + i);
            for (Plant plant : plants) {
                plant.grow();
                plant.harvest();
            }
            System.out.println();
        }
    }

    void addPlant(Plant plant) {
        plants.add(plant) ;
        System.out.println(plant.getName() +" bitkisi bitkiler grubuna eklendi!");
    }
}
