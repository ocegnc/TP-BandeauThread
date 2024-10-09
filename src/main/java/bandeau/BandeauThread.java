package bandeau;

public class BandeauThread  {
    private final Scenario scenario;
    private final Bandeau bandeau;

    public BandeauThread(Bandeau bandeau, Scenario scenario){
        this.bandeau = bandeau;
        this.scenario = scenario;
    }

    public void startThread(){
        Thread t = new Thread(this::runThread);
        if (!t.isAlive()) {
            t.start();
        }
    }

    public void runThread(){
        synchronized(bandeau){
            scenario.playOn(bandeau);
        }
    }

}
