package com.Lakhan.OOPs_Pillars.Interfaces;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power Engine started");
    }

    @Override
    public void stop() {
        System.out.println("Power engine stopped");
    }
}
