package Extends;
import Shape.Shape;

public class MessagePrime extends Shape{
	 public MessagePrime(){
	     type = "MessagePrime";
	   }

	   @Override
	   public void displayed() {
	      System.out.println("Inside MessagePrime::displayed() method.");
	   }
}

