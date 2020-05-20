package Pattern;


import Shape.Shape;
import Shape.ShapeCache;

public class Prototype{
   public void play() {
      ShapeCache.loadCache();

      Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape1.getType());		
      clonedShape1.displayed();
      
      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());		
      clonedShape2.displayed();
      
      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());		
      clonedShape3.displayed();   
   }
   
   public void mesage1() {
	   ShapeCache.loadCache();
	   	   Shape clonedShape1 = (Shape) ShapeCache.getShape("1");
	      System.out.println("Shape : " + clonedShape1.getType());
	      MainPanel.seterText(clonedShape1.getType());
	      clonedShape1.displayed();
	      
   }
   public void mesage2() {
	   ShapeCache.loadCache();
	   	Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
	    System.out.println("Shape : " + clonedShape2.getType());
	    MainPanel.seterText(clonedShape2.getType());
	    clonedShape2.displayed();
   }
   
   public void mesage3() {
	   ShapeCache.loadCache();
	   Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
	    System.out.println("Shape : " + clonedShape3.getType());
	    MainPanel.seterText(clonedShape3.getType());
	    clonedShape3.displayed();
  }
}
