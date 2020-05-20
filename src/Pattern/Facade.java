package Pattern;

import facades.HomeTheaterFacade;
public class Facade {
	 public void play()
	    {
	        
	        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
	        homeTheaterFacade.watchMovie("Move:...");
	        
	        
	        System.out.println("\nSistem stoped:");
	        MainPanel.seterText("\nSistem stoped:");
	        try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        homeTheaterFacade.stopMovie();
	    }
}
