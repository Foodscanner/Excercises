package foodServer.datatypes;

import foodServer.exceptions.NumberInvalidFormatException;

/**
 * The interface for all EANs, including EAN with 8 and EAN with 13 digits
 * @author Christian Gläser
 *
 */
public interface IEAN {
  
	/**
	 * @param ean 
 	 * @return
 	 */
	public boolean isValid(String ean);
	
	public String getEAN();
  
	public void setEan(String ean) throws NumberInvalidFormatException;

}
