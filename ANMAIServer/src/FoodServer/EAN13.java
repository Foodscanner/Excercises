package FoodServer;

import FoodServer.Exceptions.NumberInvalidFormatException;

public class EAN13 {
  
  long ean13;
  
  public EAN13(long ean) throws NumberInvalidFormatException {
    if(isValidEAN(ean)){
      ean13 = ean;
    }
    else throw new NumberInvalidFormatException("This is not a valid EAN!");
    
  }
  
  /**
   * @param number 
   * @return true if number to check is an ean
   */
  public static boolean isValidEAN(long number){
    //TODO
    return true;
  } 
}
