package OOPs_Pillars.Interfaces;

public class RadioPlayer implements Media{

    @Override
    public void start() {
        System.out.println("The radio-player has started");
    }

    @Override
    public void stop() {
        System.out.println("The radio-player has stopped");
    }
}
