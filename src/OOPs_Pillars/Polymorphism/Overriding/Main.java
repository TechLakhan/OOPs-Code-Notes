package OOPs_Pillars.Polymorphism.NormalExample;

public class Main {
    public static void main(String[] args) {
        Cricketmatch match1 = new Cricketmatch();
        Oneday match2 = new Oneday();
        Cricketmatch match3 = new T20();

        match1.matchInfo();
        match2.matchInfo();
        match3.matchInfo();
    }
}
