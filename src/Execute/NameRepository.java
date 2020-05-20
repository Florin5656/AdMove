package Execute;
import Interface.IContainer;
import Interface.IIterator;


public class NameRepository implements IContainer {
	   public String names[] = {"NCIS" , "Jacklie"};
	   /** names va extarxe din  baza de date **/
	   @Override
	   public IIterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements IIterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	}