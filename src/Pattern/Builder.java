package Pattern;

import Cart.CartBuilder;

import java.sql.SQLException;

import Cart.Cart;

public class Builder {
	CartBuilder cartBuilder = new CartBuilder();
	public void play() throws ClassNotFoundException, SQLException {
	      getCartFilm();
	      getCartSerial();
	      	}

	public void getCartFilm() throws ClassNotFoundException, SQLException {
		  Cart filmCart = cartBuilder.prepareFilmCart();
	     
	      MainPanel.seterText("\nFilm Cart");
	      MainPanel.seterText("Total Cost: " + filmCart.getCostFilm() + "$" );
	}
	
	public void getCartSerial() throws ClassNotFoundException, SQLException {
			Cart serialCart = cartBuilder.prepareSerialCart();
			
		    MainPanel.seterText("\nSerial Cart");        
		    MainPanel.seterText("Total Cost: " + serialCart.getCostSerials() + "$" );
    }

}
//