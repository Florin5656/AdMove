package Extends;
import Shape.Shape;

public class MessageLast extends Shape{
	 public MessageLast(){
	     type = "MessageLast";
	   }

	   @Override
	   public void displayed() {
	      System.out.println("Inside MessageLast::displayed() method.");
	   }
}