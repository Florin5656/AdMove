package Extends;

import Shape.Shape;

public class MessageBreack extends Shape{
	 public MessageBreack(){
	     type = "MessageBreack";
	   }

	   @Override
	   public void displayed() {
	      System.out.println("Inside MessageBreack::displayed() method.");
	   }
}
