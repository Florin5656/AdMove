package Pattern;

import Interface.IShape;
import Setings.ClasicDecor;
import Setings.CustomDecor;
import Shape.CustomShapeDecorator;
import Shape.ClasicShapeDecorator;

public class Decorator{
   public void play() {

	  IShape ClasicDecor = new ClasicDecor();
      ClasicDecor.decor();

   }
   
   public void setClasicBG(){
	     IShape ClasicShapeDecorator = new ClasicShapeDecorator(new ClasicDecor());
	      ClasicShapeDecorator.decor();
 }
 public void setCustomBG(){
	   IShape CustomShapeDecorator = new CustomShapeDecorator(new CustomDecor());
	   CustomShapeDecorator.decor();
}

}
