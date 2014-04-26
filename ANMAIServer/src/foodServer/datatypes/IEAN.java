package foodServer.datatypes;

import foodServer.exceptions.NumberInvalidFormatException;

public interface IEAN {
  
	/**
	 * @param ean 
 	 * @return
 	 */
	public boolean isValid(String ean);
	
	public String getEAN();
  
	public void setEan(String ean) throws NumberInvalidFormatException;

}
