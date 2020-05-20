package subsystem;

import Pattern.MainPanel;

/**
 * Lights definition.
 */
public class Lights {

    public void off() {
        System.out.println("Lights off.");
        MainPanel.seterText("Lights off.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void on() {
        System.out.println("Lights on.");
        MainPanel.seterText("Lights on.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
