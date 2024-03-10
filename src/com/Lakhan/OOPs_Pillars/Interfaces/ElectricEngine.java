package com.Lakhan.OOPs_Pillars.Interfaces;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void stop() {
        System.out.println("Electric car stopped.");
    }
}
