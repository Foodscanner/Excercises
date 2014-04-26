package foodServer.datatypes;

import foodServer.exceptions.NumberInvalidFormatException;

public interface IEAN {
  
  public boolean isValid(Long ean);
  
  public void setEan(Long ean) throws NumberInvalidFormatException;

}
