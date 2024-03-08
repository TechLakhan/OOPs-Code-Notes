package OOPs_Pillars.Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int carSpeed = input.nextInt();
        Car car1 = new Car();
        car1.start("Nexon");
        if (carSpeed > 120) {
            car1.speedInControl();
        }
    }
}

//Variables are static & final by default in interfaces.
//Interfaces only contains abstract method