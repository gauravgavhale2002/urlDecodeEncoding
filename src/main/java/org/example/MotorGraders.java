package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class MotorGraders {

    private List<Integer> motorCapacities;

    public MotorGraders() {
        // Motor capacity list prepare karto
        motorCapacities = new ArrayList<>();
        motorCapacities.add(100);
        motorCapacities.add(200);
        motorCapacities.add(300);
        motorCapacities.add(400);
        motorCapacities.add(500);
        motorCapacities.add(600);
        motorCapacities.add(700);
        motorCapacities.add(800);
        motorCapacities.add(900);
        motorCapacities.add(1000);
    }

    // Filter function for getting motors within a range
    public List<Integer> filterMotorsInRange(int min, int max) {
        return motorCapacities.stream()
                .filter(capacity -> capacity >= min && capacity <= max)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MotorGraders motorGraders = new MotorGraders();

        // Example: User wants motors between 300% and 700%
        int minRange = 300;
        int maxRange = 700;

        List<Integer> filteredMotors = motorGraders.filterMotorsInRange(minRange, maxRange);

        // Print filtered results
        System.out.println("Motors between " + minRange + "% and " + maxRange + "%:");
        System.out.println(filteredMotors);
    }
}
