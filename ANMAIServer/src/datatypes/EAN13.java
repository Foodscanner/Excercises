package datatypes;

import org.apache.commons.validator.routines.CodeValidator;
import org.apache.commons.validator.routines.checkdigit.EAN13CheckDigit;

import FoodServer.Exceptions.NumberInvalidFormatException;

public class EAN13 {
  
  long ean13;
  
  public EAN13(Long ean) throws NumberInvalidFormatException {
    if(isNumberValidEAN(ean)){
      ean13 = ean;
    }
    else throw new NumberInvalidFormatException("This is not a valid EAN!");
  }
  
  /**
   * @param number 
   * @return true if number to check is an ean
   */
  public static boolean isNumberValidEAN(Long number){
    CodeValidator validator = new CodeValidator("^[0-9]*$", 13, EAN13CheckDigit.EAN13_CHECK_DIGIT);

    // Validate an EAN-13 code
    if (validator.isValid(number.toString())) {
       return true;
    }
    else return false;
  } 
}
