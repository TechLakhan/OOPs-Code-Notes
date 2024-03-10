package com.Lakhan.OOPs_Others.Enums;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//        these are enum constant
//        they are public, static & final
//        since they are final cannot create child enum.
        Week() {
            System.out.println("Constructor is called for " + this.toString());
        }
//        This is not public or protected, only private or default
//        why ? we dont want to create new objects
//        this is not enum concept, thats why

//        internally : public static final Week Monday = new Week()
    }



    public static void main(String[] args) {
        Week week = Week.Monday;

//        for (Week day : Week.values() ) {
//            System.out.println(day);
//        }

//        System.out.println(week);
    }
}
