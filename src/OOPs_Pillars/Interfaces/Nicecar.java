package OOPs_Pillars.Interfaces;

public class Nicecar {
    private Engine engine;

    private Media musicPlayer;

    public Nicecar() {
        engine = new PowerEngine();
        musicPlayer = new RadioPlayer();
    }

    public void carStart() {
        engine.start();
    }

    public void carStop() {
        engine.stop();
    }

    public void startMusic() {
        musicPlayer.start();
    }

    public void stopMusic() {
        musicPlayer.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
    public void changeMusicSystem() {
        this.musicPlayer = new Musicplayer();
    }
}
