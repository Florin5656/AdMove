package TipCat;

import Interface.Item;
import Interface.ITip;
public abstract class Drama  implements Item{

	   @Override
	   public ITip tiping() {
	      return new Film();
	   }

	   @Override
	   public abstract float price();
}
