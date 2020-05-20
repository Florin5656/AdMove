package subsystem;

import Pattern.MainPanel;

/**
 * Screen definition.
 */
public class Screen {

    public void down() {
        System.out.println("Screen down.");
        MainPanel.seterText("Screen down.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void up() {
        System.out.println("Screen up.");
        MainPanel.seterText("Screen up.");
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
