package com.Lakhan.OOPs_Pillars.Polymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        Cricketmatch match1 = new Cricketmatch();
        Oneday match2 = new Oneday();
        Cricketmatch match3 = new T20();

        match3.matchInfo();

//      In overriding, the accessibility of which method can be called is dependent on the type of
//      reference variable i.e ( Cricketmatch ) but which method should be invoked is dependent on
//        Object i.e ( T20 ).


        // DYNAMIC METHOD DISPATCH
//      It is a mechanism where a call to an overridden function is resolved at runtime rather than
//      compile time.
//       As in overridding, JVM check the type of object passed at runtime when the method is getting
//        actually executed that's why it is termed as runtime polymorphism.

    }
}
