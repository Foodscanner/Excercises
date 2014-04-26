package foodServer.datatypes;

import java.util.ArrayList;
import java.util.List;

import foodServer.exceptions.NumberInvalidFormatException;

public class EAN13 implements IEAN{
  
  String ean13;
  
  public EAN13() {
    
  }
  
  public EAN13(String ean) throws NumberInvalidFormatException {
    setEan(ean);
  }
  
  /**
   * Returns true if 
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
  
  /**
   * Returns true, if number is valid GS1 ISBN, a subset of valid EAN's (starts with either 978 or 979
 * @param value
 * @return true, if number is ISBN
 */
  public boolean isISBN(String value){
	  boolean retVal = false;
	  if(isValid(value)){
		  char[] chars = value.toCharArray();
		  List<Integer> ints = new ArrayList<Integer>();
			for (char c : chars) {
				if ( Character.isDigit( c ) ) ints.add( c - '0' );
			}
		  if ((ints.get(0)==9)&&(ints.get(1)==7)&&((ints.get(2)==8)||(ints.get(2)==9))){
			  
			  retVal = true;
			  }
	  }
	  return retVal;
  }
  
  public boolean isISSN(String value){
	  boolean retVal = false;
	  if(isValid(value)){
		  char[] chars = value.toCharArray();
		  List<Integer> ints = new ArrayList<Integer>();
			for (char c : chars) {
				if ( Character.isDigit( c ) ) ints.add( c - '0' );
			}
		  if ((ints.get(0)==9)&&(ints.get(1)==7)&&(ints.get(2)==7)){
			  
			  retVal = true;
			  }
	  }
	  return retVal;
  }
  
  /**
   * Returns true, if number is valid GS1 ISSN or ISBN, a subset of valid EAN's (starts with either 977, 978 or 979
 * @param value
 * @return true, if number is ISSN or ISBN
 */
  public boolean isPrintArticle(String value){
	  return(isValid(value)&&(isISBN(value)||isISSN(value)));
  }
  
  public void setEan(String ean) throws NumberInvalidFormatException{
    if(isValid(ean)){
      ean13 = ean;
    }
    else throw new NumberInvalidFormatException("This is not a valid EAN!");
  }
  
  
}
