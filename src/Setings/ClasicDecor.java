package Setings;
import Interface.IShape;
import Pattern.MainPanel;
public class ClasicDecor implements IShape{
	@Override
	   public void decor() {
	      System.out.println("Shape: ClasicDecor();");
	      MainPanel.seterColor(0);
	   }
}
