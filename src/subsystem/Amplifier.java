package subsystem;

import Pattern.MainPanel;

/**
 * Amplifier definition.
 */
public class Amplifier {

    public void on() {
        System.out.println("Amplifier on.");
        MainPanel.seterText("Amplifier on.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        System.out.println("Setting DVD");
        MainPanel.seterText("Setting DVD");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void setSurroundSound() {
        System.out.println("Setting surround sound.");
        MainPanel.seterText("Setting surround sound.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void setVolume(int volume) {
        System.out.println("Setting volume to " + volume);
        MainPanel.seterText("Setting volume to " + volume);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void off() {
        System.out.println("Amplifier off.");
        MainPanel.seterText("Amplifier off.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }
}
