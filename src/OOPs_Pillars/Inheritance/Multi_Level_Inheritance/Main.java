package OOPs_Pillars.Inheritance.SingleInheritance;

import OOPs_Pillars.Inheritance.SingleInheritance.Box;
import OOPs_Pillars.Inheritance.SingleInheritance.Boxweight;

public class Main {
    public static void main(String[] args) {
//        Box obj1 = new Box(4);
//        System.out.println(obj1.h);
//
//        Box obj2 = new Box(obj1);
//        System.out.println(obj2.h);

//        Boxweight obj3 = new Boxweight();
//        System.out.println(obj3.h + " " + obj3.weight);

//        Boxweight obj4 = new Boxweight(2, 4, 8, 16);
//        System.out.println(obj4.l + " " + obj4.w + " "+ obj4.h + " " + obj4.weight);

//        Boxweight obj5 = new Boxweight(obj4, 18);
//        System.out.println(obj5.l + " " + obj5.w + " "+ obj5.h + " " + obj5.weight);

        Box obj7 = new Boxweight(2, 4, 8, 27);
//        System.out.println(obj7.weight);

        Box obj8 = new Boxweight(obj7);
        System.out.println(obj8.h + " " + obj8.weight);

    }
}
