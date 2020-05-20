package Stock;
import Interface.IOrder;
public class AtiveStock implements IOrder {
	private Stock abcStock;

	   public AtiveStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.active();
	   }
}
