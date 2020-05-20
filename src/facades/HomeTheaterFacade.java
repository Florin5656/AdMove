package facades;

import Pattern.MainPanel;
import subsystem.*;

/** Home Facade **/
public class HomeTheaterFacade {


    private Lights lights = new Lights();
    private Amplifier amplifier = new Amplifier();
    private DvdPlayer dvdPlayer = new DvdPlayer();
    private Projector projector = new Projector();
    private Screen screen = new Screen();
 

    public void watchMovie(String movie)
    {
        System.out.println("Get ready to watch movie...");
        MainPanel.seterText("Get ready to watch movie...");
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        lights.off();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(15);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        System.out.println("Everything is ready for watching movie!");
        MainPanel.seterText("Everything is ready for watching movie!");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void stopMovie()
    {
        System.out.println("Shutting movie theater down...");
        MainPanel.seterText("Shutting movie theater down...");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        System.out.println("Movie theater is closed!");
        MainPanel.seterText("Movie theater is closed!");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
