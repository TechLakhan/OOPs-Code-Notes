package OOPs_Pillars.Interfaces;

import java.util.Scanner;

public class Car implements Engine, Speedcontroller, Media {

    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void speedInControl() {
        System.out.println("Car speed is going out of rules. To avoid challan, please reduce the speed.");
    }
}
