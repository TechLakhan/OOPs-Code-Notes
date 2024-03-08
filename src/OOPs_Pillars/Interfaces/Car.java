package OOPs_Pillars.Interfaces;

import java.util.Scanner;

public class Car implements Engine, Speedcontroller {

    @Override
    public void start(String carName) {
        System.out.println("Car is starting");
    }

    @Override
    public void stop(String carName) {
        System.out.println("Car is stopping");
    }

    @Override
    public void speedInControl() {
        System.out.println("Car speed is going out of rules. To avoid challan, please reduce the speed.");
    }
}
