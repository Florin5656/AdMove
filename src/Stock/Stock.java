package Stock;

public class Stock {
	
	   private String name ;
	   private int quantity ;

	   public Stock(String name, int quantity) {
		   this.name = name;
		   this.quantity=quantity;
	   }
	   public void active(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] Active");
	      /** conectarea cu baza de date **/
	   }
	   public void inactive(){
	      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] Inactive");
	      /** conectarea cu baza de date **/
	   }
	}
