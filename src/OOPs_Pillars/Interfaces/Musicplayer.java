package OOPs_Pillars.Interfaces;

public class Musicplayer implements Media {

    @Override
    public void start() {
        System.out.println("The music player has been started !");
    }

    @Override
    public void stop() {
        System.out.println("The music player has been stopped !");
    }
}
