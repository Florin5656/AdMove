package Cart;

import Film.Jackie;
import Serial.NCIS;


public class CartBuilder {
	public Cart prepareFilmCart (){
	      Cart cart = new Cart();
	      cart.addItem(new Jackie());
	    
	      return cart;
	   }   

	   public Cart prepareSerialCart (){
	      Cart cart = new Cart();
	      cart.addItem(new NCIS());
	      return cart;
	   }
}
