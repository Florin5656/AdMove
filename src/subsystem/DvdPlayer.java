package subsystem;

import Pattern.MainPanel;

/**
 * DvD Player Definition.
 */
public class DvdPlayer {

    public void on() {
        System.out.println("DVD player on.");
        MainPanel.seterText("DVD player on.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void play(String movie) {
        System.out.println("Start playing movie " + movie);
        MainPanel.seterText("Start playing movie " + movie);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void stop() {
        System.out.println("Stopping DVD player.");
        MainPanel.seterText("Stopping DVD player.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void eject() {
        System.out.println("Ejecting DVD.");
        MainPanel.seterText("Ejecting DVD.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void off() {
        System.out.println("DVD player off.");
        MainPanel.seterText("DVD player off.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
