package Setings;
import Interface.IShape;
import Pattern.MainPanel;

public class CustomDecor implements IShape {
	@Override
	   public void decor() {
		MainPanel.seterColor(1);
	   }
}
