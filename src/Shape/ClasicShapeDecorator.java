package Shape;

import Interface.IShape;

public class ClasicShapeDecorator  extends ShapeDecorator{
	public ClasicShapeDecorator(IShape decoratedShape) {
	      super(decoratedShape);		
	   }

	   @Override
	   public void decor() {
	      decoratedShape.decor();	       
	      setRedBorder(decoratedShape);
	   }

	   private void setRedBorder(IShape decoratedShape){
	      System.out.println("Background Color:White");
	   }
}
