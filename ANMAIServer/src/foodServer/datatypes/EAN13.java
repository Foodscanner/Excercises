package foodServer.datatypes;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.CodeValidator;
import org.apache.commons.validator.routines.checkdigit.EAN13CheckDigit;

import foodServer.exceptions.NumberInvalidFormatException;

public class EAN13 implements IEAN{
  
  String ean13;
  
  public EAN13() {
    
  }
  
  public EAN13(String ean) throws NumberInvalidFormatException {
    setEan(ean);
  }
  
  /**
   * @param number 
   * @return true if number to check is an ean
   * @source: Hibernate Validator v1.4
   */
  public boolean isValid(String value) {
			if (value == null) return false;
			String creditCard = (String) value;
			char[] chars = creditCard.toCharArray();

			List<Integer> ints = new ArrayList<Integer>();
			for (char c : chars) {
				if ( Character.isDigit( c ) ) ints.add( c - '0' );
			}
			int length = ints.size();
			int sum = 0;
			boolean even = false;
			for ( int index = length - 1 ; index >= 0 ; index-- ) {
				int digit = ints.get(index);
				if  (even) {
					digit *= 3;
				}
				sum+= digit;
				even = !even;
			}
			return  sum % 10 == 0;
	}
  
  public void setEan(String ean) throws NumberInvalidFormatException{
    if(isValid(ean)){
      ean13 = ean;
    }
    else throw new NumberInvalidFormatException("This is not a valid EAN!");
  }
}
