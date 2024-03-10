package com.Lakhan.OOPs_Pillars.Inheritance.Single_Inheritance;

public class Boxweight extends Box {
    double weight;

    static void message() {
        System.out.println("I am in Boxweight class. Hurray !");
    }

    public Boxweight() {
        this.weight = -1;
    }

    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);
        // This super keyword is used to call the parent class constructor.
        // used to initialize assigned values in parent class.

//        System.out.println(super.weight);
        // To access the value of superclass if the same variable is present in subclass & superclass
        // here we can see that weight is present in both classes.

        // if super is not used in subclass constructor then parent class will call the default constructor. i.e Box().
        this.weight = weight;
    }

    public Boxweight(Box old, double weight) {
        super(old);
        this.weight = weight;
    }

    Boxweight (Boxweight other) {
        super(other);
        this.weight = other.weight;
    }
}
