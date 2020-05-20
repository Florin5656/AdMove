package Shape;

import java.util.Hashtable;
import Extends.MessageBreack;
import Extends.MessagePrime;
import Extends.MessageLast;

public class ShapeCache {
	
   private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

   public static Shape getShape(String shapeId) {
      Shape cachedShape = shapeMap.get(shapeId);
      return (Shape) cachedShape.clone();
   }

   
   
   public static void loadCache() {
      MessagePrime Prime = new MessagePrime();
      Prime.setId("1");
      shapeMap.put(Prime.getId(),Prime);

      MessageBreack Breack = new MessageBreack();
      Breack.setId("2");
      shapeMap.put(Breack.getId(),Breack);

      MessageLast Last = new MessageLast();
      Last.setId("3");
       shapeMap.put(Last.getId(), Last);
   }

}
