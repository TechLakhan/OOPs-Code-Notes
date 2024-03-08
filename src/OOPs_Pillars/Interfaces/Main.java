package OOPs_Pillars.Interfaces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int carSpeed = input.nextInt();
//        Media car1 = new Musicplayer();
//        car1.start("Nexon");
//        if (carSpeed > 120) {
//            car1.speedInControl();
//        }
//        car1.start();
//        car1.start();

        Nicecar newCar = new Nicecar();
        newCar.carStart();
        newCar.startMusic();

        newCar.upgradeEngine();
        newCar.changeMusicSystem();

        newCar.carStart();
        newCar.startMusic();
    }
}

//Variables are static & final by default in interfaces.
//Interfaces only contains abstract method