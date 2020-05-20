package Stock;
import Interface.IOrder;
public class InactiveStock implements IOrder  {
	private Stock abcStock;

	   public InactiveStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.inactive();
	   }
}
