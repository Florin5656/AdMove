package subsystem;

import Pattern.MainPanel;

/**
 * Projector definition.
 */
public class Projector {

    public void on() {
        System.out.println("Projector on.");
        MainPanel.seterText("Projector on.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void wideScreenMode() {
        System.out.println("Setting wide screen.");
        MainPanel.seterText("Setting wide screen.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void off() {
        System.out.println("Wide screen off.");
        MainPanel.seterText("Wide screen off.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
