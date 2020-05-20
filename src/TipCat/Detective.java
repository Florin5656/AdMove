package TipCat;

import Interface.Item;
import Interface.ITip;

public abstract class Detective implements Item {
	@Override
	public ITip tiping() {
       return new Serial();
	}

	@Override
	public abstract float price();
}
